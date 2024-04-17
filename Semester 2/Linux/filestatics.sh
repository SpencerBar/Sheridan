#!/bin/bash

# Assignment 2
# Course:SYST15123
# Family Name:Barnes
# Given Name:Spencer
# Student Number:991728219
# Login name:barnessp
# Professor:Dr. Nick Sajadi
#checking whether there is a variable passed in
if [ $# != 1 ]; then
  echo "You must enter a path:"
  echo "Usage: $0 pathname"
  exit 1
fi
#creating variables for the file type count
path="$1"
ordinary_count=0
block_count=0
character_count=0
directory_count=0
link_count=0
pipe_count=0
socket_count=0
#creating variables for the permissions count
owner_r=0
owner_w=0
owner_x=0
group_r=0
group_w=0
group_x=0
others_r=0
others_w=0
others_x=0
# making sure $1 is a directory
if [ ! -d "$path" ]; then
  echo "$1 not found!"
  exit 2
else
#for each file in the path
  for file in "$path"/*; do
  #checking if its a directory type to count that
    if [ -d "$file" ]; then
      ((directory_count++))
      #if not a directory then using case and the stat command with %F to check which type it is
    elif [ -f "$file" ]; then
      file_type=$(stat -c %F "$file")
      case "$file_type" in
        "regular file")
          ((ordinary_count++));;
        "block special file")
          ((block_count++));;
        "character special file")
          ((character_count++));;
        "symbolic link")
          ((link_count++));;
        "named pipe")
          ((pipe_count++));;
        "socket")
          ((socket_count++));;
      esac
    fi
  done
  # for each file in the directory  echo the $file_permissions, and then cut the permission character we want to check ( they are all in fixed positions ) 
  #then search for the occurance of that permission instead of a "-" and tally the occurances
  for file in "$path"/*; do
    if [ -f "$file" ]; then
      file_permissions=$(stat -c %A "$file")

      owner_r=$((owner_r + $(echo "$file_permissions" | cut -c 2 | grep -c "r")))
      owner_w=$((owner_w + $(echo "$file_permissions" | cut -c 3 | grep -c "w")))
      owner_x=$((owner_x + $(echo "$file_permissions" | cut -c 4 | grep -c "x")))
      group_r=$((group_r + $(echo "$file_permissions" | cut -c 5 | grep -c "r")))
      group_w=$((group_w + $(echo "$file_permissions" | cut -c 6 | grep -c "w")))
      group_x=$((group_x + $(echo "$file_permissions" | cut -c 7 | grep -c "x")))
      others_r=$((others_r + $(echo "$file_permissions" | cut -c 8 | grep -c "r")))
      others_w=$((others_w + $(echo "$file_permissions" | cut -c 9 | grep -c "w")))
      others_x=$((others_x + $(echo "$file_permissions" | cut -c 10 | grep -c "x")))
    fi
  done
fi
#print out the formatted results (had to mess around with spaces and tabs because just tabs looked wrong)
echo "Here is the \"$path\" directory file type statistics:"
echo -e "\"Ordinary\" \"Block\" \"Character\" \"Directory\" \"Link\" \"Pipe\" \"Socket\""
echo -e "$ordinary_count\t    $block_count\t    $character_count\t\t$directory_count\t    $link_count\t  $pipe_count\t $socket_count"
echo -e "\n"
echo "Here is the \"$path\" directory permission statistics:"
echo -e ' "Owner"\t"Group"  \t"Others"'
echo -e " r  w  x\tr  w  x  \tr  w  x"
echo -e " $owner_r $owner_w $owner_x\t$group_r $group_w $group_x\t\t$others_r $others_w $others_x"
