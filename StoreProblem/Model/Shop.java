package Model;

public class Shop {
    String name;
    int length;
    int width;
    int[][] space;

    public Shop(String name , int length , int width)
    {
        this.name = name;
        this.width = width;
        this.length = length;
        space = new int[width][length];
    }

    boolean checkAvailablityAndFill(Box box)
    {
        int n= box.getLength();
        int m= box.getWidth();
        int id = box.getId();

        int St_row=-1;
        int St_col=-1;
        for(int row=0;row<length;row++)
        {
            for(int col=0;col<width;col++)
            {
                if(space[row][col] == 0)
                {
                    int tempRow = row;
                    int tempCol = col;
                    int rows = 0;
                    int cols=0;

                    while(rows<n && tempRow<length)
                    {
                        if(space[tempRow][col] == 0)
                            rows++;
                        else    
                            break;
                        
                        tempRow++;
                    }

                    while(cols<m && tempCol<width)
                    {
                        if(space[row][tempCol] == 0)
                            cols++;
                        else    
                            break;
                        
                        tempCol++;
                    }

                    if(rows == n && cols ==m)
                    {
                        St_row = row;
                        St_col = col;
                        fillSpace(St_row, St_col, n, m, id);
                        return true;
                    }
                }


            }
        }
        return false;
    }

    void fillSpace(int row , int col , int n, int m,int id)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                space[row+i][col+j]=id;
            }
        }
    }

    public void printSpace()
    {
        for(int len=0;len<length;len++)
        {
            for(int wid=0;wid<width;wid++)
                System.out.print(space[len][wid] + "    ");
            
            System.err.println();
        }
    }
}
