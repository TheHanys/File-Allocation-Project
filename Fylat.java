package fileallocation;

import java.util.ArrayList;

public class Fylat 
{
    public int filesize;
    public String filename;
    public ArrayList<Integer> start;
    
    public Fylat(String filename, int filesize)
    {
        this.filename = filename;
        this.filesize = filesize;
        this.start=null;
    }
    public int getsize()
    {
        return filesize;
    }
}
