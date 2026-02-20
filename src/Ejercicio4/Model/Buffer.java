package Ejercicio4.Model;

public class Buffer {
    private int sizeBuffer;
    private String text;

    public Buffer(int sizeBuffer, String text) {
        this.sizeBuffer=sizeBuffer;
        this.text=text;
    }

    public void setSizeBuffer(int sizeBuffer) {
        this.sizeBuffer = sizeBuffer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getSizeBuffer() {
        return sizeBuffer;
    }
}
