public class Computer {
    private int memory;
    private String videoCard;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory > 0)
        this.memory = memory;

    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
}
