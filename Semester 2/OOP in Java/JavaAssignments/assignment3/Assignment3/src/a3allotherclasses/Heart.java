package a3allotherclasses;
public class Heart {
    private int bpm;
    HeartBeat heartbeat;
    public Heart(int bpm, HeartBeat heartbeat)
    {
        this.bpm = bpm;
        this.heartbeat = heartbeat;
    }
    public int getBpm(){
        return this.bpm;
    }
    public void setBpm(int bpm){
        this.bpm = bpm;
    }
    public void oneMinute(){
        for (int i = 0; i < bpm; i++){
            System.out.println(this.heartbeat);
        }

    }
}
