package fileallocation;
import java.util.ArrayList;
import java.util.Scanner;
public class FileAllocation 
{
    public static void main(String[] args)
    {
        ArrayList<Fylat> files = new ArrayList();
        int filesize, blocknum,filenum;
        String filename;
        Scanner input=new Scanner(System.in);
        System.out.println("*********************************************\n");
        System.out.println("Welcome to 'THE ALLOCATION PROGRAM' \n");
        System.out.println("*********************************************\n\n\n");
        System.out.println("Enter memory block size:");
        blocknum=input.nextInt();
        System.out.println("Enter files number:");
        filenum=input.nextInt();
        System.out.println ("\nPlease enter the name and size of each file:\n");
        
	for (int i = 0; i < filenum; i++)
	{
	    filename=input.next();
	    filesize=input.nextInt();
            files.add(new Fylat(filename,filesize));
	}

        Allocate x=new Allocate(blocknum,files);
        System.out.println("Choose your needed method:");
        System.out.println("Press 1 for Contiguous");
        System.out.println("Press 2 for Linked");
        System.out.println("Press 3 for Indexed");
        int w=input.nextInt();
        System.out.println("\n");
        switch(w)
        {
            case 1:
            {
                x.contiguous();
                x.display();
                break;
            }
            case 2:
            {
                x.linked();
                x.display();
                break;
            }
            case 3:
            {
                x.indexed();
                x.display();
                break;
            }
        }
    }    
}
