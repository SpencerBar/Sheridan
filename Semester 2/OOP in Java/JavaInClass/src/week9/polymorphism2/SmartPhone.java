package polymorphism2;

public class SmartPhone implements ICamera , Phone   //we will make SmartPhone implement Phone, Camera, AudioPlayer 
{
    @Override
   public void makeCall(int num)
    {
        System.out.println("Making Call to #: " + num);
    } 
    @Override
    public void answerCall()
    {
        System.out.println("Answering Call");
    }
    @Override
    public void lookupContact()
    {
        System.out.println("Looking for contacts!");
    }
    @Override
    public void takePhoto()
    {
        this.autoFocus();
        System.out.println("Taking Photo");
    }
    @Override
    public void deletePhoto()
    {
        System.out.println("Deleting Photo");
    }
    @Override
    public void zoom(int percent)
    {
        System.out.println("Zooming " + percent + "%");
    }
    @Override
    public void autoFocus()
    {
        System.out.println("Autofocusing");
    }
    
    
    public void playSong()
    {
        System.out.println("Playing Song");
    }
    
}
