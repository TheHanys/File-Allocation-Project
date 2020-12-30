
    public void linked()
    {
       int count; // count=hagm el file
        System.out.println("**************\n");
        System.out.println("Display #1 \n");
        System.out.println("**************\n\n");
        
        for (int i = 0; i < files.size(); i++)          
	{
            int check=0;
            for(int z=0;z<blocks.length;z++)
            {
                if(blocks[z]==null)
                {
                    check++;
                }
            }
            if(check>=files.get(i).filesize)
            {
                this.lastaccess = rand.nextInt(blocknum);

                count=0;
             
                while(count!=files.get(i).filesize)
                {
                    while(blocks[lastaccess]!= null)
                    {
                        this.lastaccess = rand.nextInt(blocknum);
                    }
                    blocks[this.lastaccess]=files.get(i);
                    count++;
                    if (count==1)
                    {
                        System.out.println("File "+files.get(i).filename +"'s starting block is: " + (lastaccess));
                    }
                }
                    System.out.println("File "+files.get(i).filename +"'s ending block is: " + (lastaccess));
                    System.out.println("File "+files.get(i).filename +"'s size is: " + (count)); 
            }
            else 
            {
                System.out.println("File "+files.get(i).filename +" can't be allocated");
            }
        }   
        System.out.println("\n**************\n");
        System.out.println("Display #2 \n");
        System.out.println("**************\n");
    }
    
    public void indexed()
    {
        int count=0;
        for(int i=0;i<files.size();i++)
        {
            indexed.add(new ArrayList<Integer>());//two dim array rakam el file w ely byshawr
            int check=0;
            for(int z=0;z<blocks.length;z++)
            {
                if(blocks[z]==null)
                {
                    check++;
                }
            }
            if(check>=files.get(i).filesize)
            {
                int counter2=0;
                this.lastaccess = rand.nextInt(blocknum);
                if(counter2==0&&blocks[lastaccess]==null)
                {
                    files.get(i).start=indexed.get(i);
                }

                count=0;
                while(count!=files.get(i).filesize)
                {
                    while(blocks[lastaccess]!= null)
                    {
                        this.lastaccess = rand.nextInt(blocknum);
                    }
                    blocks[this.lastaccess]=files.get(i);
                    files.get(i).start.add(lastaccess);
                    count++;
                    counter2++;
                }
            }
        }
        for(int j=0;j<indexed.size();j++)
        {
            System.out.println(" File " + j);
            for(int z=0;z<indexed.get(j).size();z++)
            {
                if(z==indexed.get(j).size()-1)
                {
                     System.out.println(" File Block "+j+" Memory Block Number "+indexed.get(j).get(z)+" Next BLock Number: None ");
                     break;
                }
             System.out.println(" File Block "+j+" Memory Block Number "+indexed.get(j).get(z)+" Next BLock Number "+indexed.get(j).get(z+1));
            }
            System.out.println("");
        }   
    }
}
