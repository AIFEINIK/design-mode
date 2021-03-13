package org.example.service.bean;

/**
 * @author ZhangPengFei
 * @discription 产品角色
 */
public class Computer {

    private String cpu;
    private String memory;
    private String displayCard;
    private String disk;

    public Computer() {
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisplayCard() {
        return displayCard;
    }

    public void setDisplayCard(String displayCard) {
        this.displayCard = displayCard;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", displayCard='" + displayCard + '\'' +
                ", disk='" + disk + '\'' +
                '}';
    }
}
