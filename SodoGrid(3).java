package projecto;





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class SodoGrid extends JFrame  {
    JLabel jllNewGame;
    JLabel jllHintNum;//剩余提示次数
    JButton jbnNum1;
    JButton jbnNum2;
    JButton jbnNum3;
    JButton jbnNum4;
    JButton jbnNum5;
    JButton jbnNum6;
    JButton jbnNum7;
    JButton jbnNum8;
    JButton jbnNum9;
    JButton jbnEasy;
    JButton jbnMid;
    JButton jbnDit;
    JButton jbnBackout;
    JButton jbnHint;
    JButton jbnWipe;
    JButton jbnNote;
    int a,b;
   
    JPanel[] pnlGame;
    JTextField[][][] txtGame;
    
    
    

    public SodoGrid() {
        pnlGame = new JPanel[9];
        txtGame = new JTextField[9][3][3];
        gridInit();
    }

    public void gridInit(){
        Container container = this.getContentPane();
        container.setLayout(null);
        this.setSize(1100,800);
        this.setLocationRelativeTo(null);
        this.setTitle("快乐数独");
      
      
        
       
        ActionListener myListener = new MyListener();
  
      
         
        
        	   
       
        
        
        jllNewGame=new JLabel();
        jllNewGame.setIcon(new ImageIcon("shudu.png"));
        jllNewGame.setSize(375,100);
        jllNewGame.setLocation(700,0);
        container.add(jllNewGame);

        jbnNum1 = new JButton("1");
        jbnNum1.setBackground(Color.lightGray);
        jbnNum1.setSize(125,100);
        jbnNum1.setLocation(700,250);
        jbnNum1.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum1);

        jbnNum2 = new JButton("2");
        jbnNum2.setBackground(Color.lightGray);
        jbnNum2.setSize(125,100);
        jbnNum2.setLocation(825,250);
        jbnNum2.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum2);

        jbnNum3 = new JButton("3");
        jbnNum3.setBackground(Color.lightGray);
        jbnNum3.setSize(125,100);
        jbnNum3.setLocation(950,250);
        jbnNum3.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum3);

        jbnNum4 = new JButton("4");
        jbnNum4.setBackground(Color.lightGray);
        jbnNum4.setSize(125,100);
        jbnNum4.setLocation(700,350);
        jbnNum4.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum4);

        jbnNum5 = new JButton("5");
        jbnNum5.setBackground(Color.lightGray);
        jbnNum5.setSize(125,100);
        jbnNum5.setLocation(825,350);
        jbnNum5.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum5);

        jbnNum6 = new JButton("6");
        jbnNum6.setBackground(Color.lightGray);
        jbnNum6.setSize(125,100);
        jbnNum6.setLocation(950,350);
        jbnNum6.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum6);

        jbnNum7 = new JButton("7");
        jbnNum7.setBackground(Color.lightGray);
        jbnNum7.setSize(125,100);
        jbnNum7.setLocation(700,450);
        jbnNum7.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum7);

        jbnNum8 = new JButton("8");
        jbnNum8.setBackground(Color.lightGray);
        jbnNum8.setSize(125,100);
        jbnNum8.setLocation(825,450);
        jbnNum8.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum8);

        jbnNum9 = new JButton("9");
        jbnNum9.setBackground(Color.lightGray);
        jbnNum9.setSize(125,100);
        jbnNum9.setLocation(950,450);
        jbnNum9.setFont(new Font("微软雅黑",Font.PLAIN,40));
        container.add(jbnNum9);

        jbnEasy = new JButton("简单");
        jbnEasy.setBackground(Color.green);
        jbnEasy.setSize(125,100);
        jbnEasy.setLocation(700,100);
        jbnEasy.setFont(new Font("宋体",Font.PLAIN,40));
        container.add(jbnEasy);

        jbnMid = new JButton("中等");
        jbnMid.setBackground(Color.yellow);
        jbnMid.setSize(125,100);
        jbnMid.setLocation(825,100);
        jbnMid.setFont(new Font("宋体",Font.PLAIN,40));
        container.add(jbnMid);

        jbnDit = new JButton("困难");
        jbnDit.setBackground(Color.red);
        jbnDit.setSize(125,100);
        jbnDit.setLocation(950,100);
        jbnDit.setFont(new Font("宋体",Font.PLAIN,40));
        container.add(jbnDit);

        jbnBackout = new JButton("撤销");
        jbnBackout.setBackground(Color.ORANGE);
        jbnBackout.setSize(150,100);
        jbnBackout.setLocation(735,550);
        jbnBackout.setFont(new Font("楷体",Font.PLAIN,40));
        container.add(jbnBackout);

        jbnHint = new JButton("提示");
        jbnHint.setBackground(Color.ORANGE);
        jbnHint.setSize(150,100);
        jbnHint.setLocation(735,650);
        jbnHint.setFont(new Font("楷体",Font.PLAIN,40));
        container.add(jbnHint);

        jbnWipe = new JButton("擦除");
        jbnWipe.setBackground(Color.ORANGE);
        jbnWipe.setSize(150,100);
        jbnWipe.setLocation(885,550);
        jbnWipe.setFont(new Font("楷体",Font.PLAIN,40));
        container.add(jbnWipe);

        jbnNote = new JButton("笔记");
        jbnNote.setBackground(Color.ORANGE);
        jbnNote.setSize(150,100);
        jbnNote.setLocation(885,650);
        jbnNote.setFont(new Font("楷体",Font.PLAIN,40));
        container.add(jbnNote);

        jllHintNum= new JLabel("3");//剩余提示次数
        jllHintNum.setLocation(715,650);
        jllHintNum.setSize(30,40);
        jllHintNum.setFont(new Font("楷体",Font.PLAIN,30));
        container.add(jllHintNum);

        for( int i=0;i<9;i++ ){
            pnlGame[i]=new JPanel();
            pnlGame[i].setBorder(BorderFactory.createLineBorder(Color.black,2));
            pnlGame[i].setLayout(new GridLayout(3,3));
            pnlGame[i].setSize(225,225);
            if( i==0 ){
                pnlGame[i].setLocation(0,50);
              
                this.add(pnlGame[i]);
                
                
            }else if( i==1 ){
                pnlGame[i].setLocation(225,50);
        
            }else if( i==2 ){
                pnlGame[i].setLocation(450,50);
                
            }else if( i==3 ){
                pnlGame[i].setLocation(0,275);
            }else if( i==4 ){
                pnlGame[i].setLocation(225,275);
            }else if( i==5 ){
                pnlGame[i].setLocation(450,275);
            }else if( i==6 ){
                pnlGame[i].setLocation(0,500);
            }else if( i==7 ){
                pnlGame[i].setLocation(225,500);
            }else if( i==8 ){
                pnlGame[i].setLocation(450,500);
            }
            container.add(pnlGame[i]);
        }
    
        for(int z=0;z<9;z++){
            for(int x=0;x<3;x++){
                for(int y=0;y<3;y++){
                    txtGame[z][x][y]=new JTextField();
                    txtGame[z][x][y].setBorder(BorderFactory.createLineBorder(Color.black,1));
                    txtGame[z][x][y].setFont(new Font("Dialog", Font.ITALIC, 20));
                    txtGame[z][x][y].setHorizontalAlignment(JTextField.CENTER);
                    pnlGame[z].add(txtGame[z][x][y]);
                }
            }
        }
        
       
     
        jbnEasy .addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	reset();
         	   int[][] sodo1=easygame();
         	    
         	    setqipan(sodo1);
            }

			
        });
        jbnMid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	reset();
         	   int[][] sodo1=Midgame();
         	    
         	    setqipan(sodo1);
            }

			
        });
        jbnDit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	reset();
         	   int[][] sodo1=hardgame();
         	    
         	    setqipan(sodo1);
            }

			
        });

      
   
    		  
    
        
       

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
       
        jbnNum2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         	   pnlGame[0].setLocation(0,25); 
            }
        }); 
      }
        
        
        

    
    
   public void test() {
	   jbnNum2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
        	   pnlGame[0].setLocation(0,25); 
           }
       });
   }
   public void reset() {
	   for(int z=0;z<9;z++){
           for(int x=0;x<3;x++){
               for(int y=0;y<3;y++){
            	   txtGame[z][x][y].setText("");
	    			  txtGame[z][x][y].setEditable(true);
               }
           }
       }
   }
   
   public void setqipan(int[][]sodo1) {

	      for(int a=0;a<9;a++) {
	    	  for(int b=0;b<9;b++) {
	    		  if(a<3&&b<3) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[0][a][b].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[0][a][b].setEditable(false);}
	    			  
	    		  }
	    		  if(a>2&&a<6&&b<3) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[3][a-3][b].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[3][a-3][b].setEditable(false);}
	    		  }
	    		  if(a>5&&b<3) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[6][a-6][b].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[6][a-6][b].setEditable(false);}
	    		  }
	    		  if(a<3&&b>2&&b<6) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[1][a][b-3].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[1][a][b-3].setEditable(false);}
	    		  }
	    		  if(a>2&&a<6&&b>2&&b<6) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[4][a-3][b-3].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[4][a-3][b-3].setEditable(false);}
	    		  }
	    		  if(a>5&&b>2&&b<6) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[7][a-6][b-3].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[7][a-6][b-3].setEditable(false);}
	    		  }
	    		  if(a<3&&b>5) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[2][a][b-6].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[2][a][b-6].setEditable(false);}
	    		  }
	    		  if(a>2&&a<6&&b>5) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[5][a-3][b-6].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[5][a-3][b-6].setEditable(false);}
	    		  }
	    		  if(a>5&&b>5) {
	    			  if(sodo1[a][b]!=0) {
	    			  txtGame[8][a-6][b-6].setText(String.valueOf(sodo1[a][b]));
	    			  txtGame[8][a-6][b-6].setEditable(false);}
	    		  
	    	  }
	    	  }}
	        
	       

   }
   public int[][] easygame() {
		// TODO Auto-generated method stub
	 
	   int a=(int)(Math.random()*10);
	  
	   switch(a) {
	   
	   case 0:
	   int eas1[][]={
		    		  {0,6,1,0,3,0,0,2,0},
		    		  {0,5,0,0,0,8,1,0,7},
		    		  {0,0,0,0,0,7,0,3,4},
		    		  {0,0,9,0,0,6,3,7,8},
		    		  {0,0,3,2,7,9,5,0,0},
		    		  {5,7,0,3,0,0,9,0,2},
		    		  {1,9,0,7,6,0,0,0,0},
		    		  {8,0,2,4,0,0,7,6,0},
		    		  {6,4,0,0,1,0,2,5,0},
		    		  
		      };
        return eas1;
       
	   case 1:
		   int eas2[][]={
		    		  {1,0,0,8,3,0,0,0,2},
		    		  {5,7,0,0,0,1,0,0,0},
		    		  {0,0,0,5,0,9,0,6,4},
		    		  {7,0,4,0,0,8,5,9,0},
		    		  {0,0,3,0,1,0,4,0,0},
		    		  {0,5,1,4,0,0,3,0,6},
		    		  {3,6,0,7,0,4,0,0,0},
		    		  {0,0,0,6,0,0,0,7,9},
		    		  {8,0,0,0,5,2,0,0,3},
		    		  
		      };
		  return eas2;
		  
	   case 2:
		   int eas3[][]={
		    		  {0,3,0,0,0,7,0,0,4},
		    		  {6,0,2,0,4,1,0,0,0},
		    		  {0,5,0,0,3,0,9,6,7},
		    		  {0,4,0,0,0,3,0,0,6},
		    		  {0,8,7,0,0,0,3,5,0},
		    		  {9,0,0,7,0,0,0,2,0},
		    		  {7,1,8,0,2,0,0,4,0},
		    		  {0,0,0,1,6,0,8,0,9},
		    		  {4,0,0,5,0,0,0,3,0},
		    		  
		   };
		 return eas3;
		 
		  
	   case 3:
		  int eas4[][]={
		    		  {0,8,5,0,0,0,2,1,0},
		    		  {0,9,4,0,1,2,0,0,3},
		    		  {0,0,0,3,0,0,7,0,4},
		    		  {5,0,3,4,0,9,0,0,0},
		    		  {0,4,0,2,0,6,0,3,0},
		    		  {0,0,0,1,0,3,9,0,7},
		    		  {6,0,8,0,0,5,0,0,0},
		    		  {1,0,0,8,4,0,3,6,0},
		    		  {0,2,7,0,0,0,8,9,0},
		    		  
		      };
		 return eas4;
		 
	   case 4:
		  int eas5[][]={
		    		  {0,8,0,0,0,1,6,0,0},
		    		  {0,7,0,4,0,0,0,2,1},
		    		  {5,0,0,3,9,6,0,0,0},
		    		  {2,0,4,0,5,0,1,3,0},
		    		  {0,0,8,9,0,7,5,0,0},
		    		  {0,5,7,0,3,0,9,0,0},
		    		  {0,0,0,5,6,3,0,0,9},
		    		  {3,1,0,0,0,2,0,5,0},
		    		  {0,0,5,8,0,0,0,4,0},
		    		  
		      };
		return eas5;
		  
	   case 5:
		 int  eas6[][]={
		    		  {0,0,1,0,0,0,5,0,0},
		    		  {0,8,0,0,0,6,2,9,0},
		    		  {6,3,0,2,0,0,0,0,4},
		    		  {0,5,0,8,0,9,7,0,0},
		    		  {0,0,0,0,1,0,0,0,0},
		    		  {0,0,9,5,0,7,0,3,0},
		    		  {5,0,0,0,0,1,0,6,9},
		    		  {0,9,3,7,0,0,0,1,0},
		    		  {0,0,2,0,0,0,3,0,0},
		    		  
		      };
		 return eas6;
		   
	   case 6:
		int   eas7[][]={
		    		  {9,1,0,0,0,0,0,3,7},
		    		  {0,0,2,0,0,0,6,0,0},
		    		  {8,0,0,6,0,9,0,0,5},
		    		  {0,9,0,3,0,2,0,5,0},
		    		  {0,0,4,0,8,0,7,0,0},
		    		  {0,6,0,7,0,1,0,8,0},
		    		  {6,0,0,2,0,8,0,0,4},
		    		  {0,0,1,0,0,0,3,0,0},
		    		  {2,5,0,0,0,0,0,1,9},
		    		  
		      };
		  return  eas7;
		  
	   case 7:
		 int  eas8[][]={
		    		  {8,0,3,0,0,1,0,0,0},
		    		  {0,0,0,0,0,0,4,0,0},
		    		  {1,0,0,0,2,8,0,0,3},
		    		  {9,0,4,0,6,0,0,1,7},
		    		  {0,0,0,4,0,5,0,0,0},
		    		  {2,1,0,0,8,0,3,0,6},
		    		  {3,0,0,2,7,0,0,0,5},
		    		  {0,0,9,0,0,0,0,0,0},
		    		  {0,0,0,8,0,0,6,0,2},
		    		  
		      };
		 return eas8;
		
	   case 8:
		int   eas9[][]={
		    		  {0,0,8,0,0,0,6,0,0},
		    		  {0,5,0,0,4,0,0,8,0},
		    		  {7,9,0,6,0,8,0,4,5},
		    		  {4,0,0,0,5,0,0,0,6},
		    		  {0,0,0,2,0,1,0,0,0},
		    		  {2,0,0,0,7,0,0,0,3},
		    		  {9,1,0,5,0,7,0,3,8},
		    		  {0,3,0,0,6,0,0,2,0},
		    		  {0,0,4,0,0,0,7,0,0},
		    		  
		      };
		   return eas9;
		 
	   case 9:
		 int  eas10[][]={
		    		  {0,0,0,0,0,7,0,0,4},
		    		  {8,0,0,0,0,0,0,6,0},
		    		  {5,4,0,9,2,0,0,0,1},
		    		  {4,5,9,0,1,0,0,0,3},
		    		  {2,0,0,0,0,0,0,0,9},
		    		  {1,0,0,0,3,0,4,8,2},
		    		  {7,0,0,0,5,8,0,9,6},
		    		  {0,1,0,0,0,0,0,0,5},
		    		  {6,0,0,7,0,0,0,0,0},
		    		  
		      };
		 return eas10;
		
	
		
	   
	   }
	return null;
	
		
	}
   
   public int[][] Midgame() {
		// TODO Auto-generated method stub
	 
	   int a=(int)(Math.random()*10);
	  
	   switch(a) {
	   
	   case 0:
	   int eas1[][]={
		    		  {0,0,0,1,0,0,2,6,0},
		    		  {7,0,0,0,3,0,0,0,0},
		    		  {3,0,2,0,8,0,4,0,0},
		    		  {0,0,0,4,0,8,0,0,1},
		    		  {0,3,5,0,0,0,9,4,0},
		    		  {2,0,0,3,0,5,0,0,0},
		    		  {0,0,6,0,5,0,7,0,9},
		    		  {0,0,0,0,4,0,0,0,8},
		    		  {0,5,7,0,0,9,0,0,0},
		    		  
		      };
       return eas1;
      
	   case 1:
		   int eas2[][]={
				      {0,0,8,0,9,0,0,0,0},
		    		  {0,7,0,0,0,0,2,8,0},
		    		  {0,6,4,1,0,0,3,0,9},
		    		  {0,0,0,8,0,5,9,0,0},
		    		  {5,0,0,0,0,0,0,0,1},
		    		  {0,0,9,3,0,4,0,0,0},
		    		  {8,0,2,0,0,7,5,6,0},
		    		  {0,9,7,0,0,0,0,1,0},
		    		  {0,0,0,0,6,0,0,7,0},
		    		  
		      };
		  return eas2;
		  
	   case 2:
		   int eas3[][]={
				      {0,0,0,7,0,2,0,0,0},
		    		  {1,0,0,0,4,0,0,0,7},
		    		  {6,5,0,0,0,0,0,9,4},
		    		  {4,7,0,8,0,1,0,6,2},
		    		  {0,0,0,0,0,0,0,0,0},
		    		  {5,8,0,2,0,9,0,1,3},
		    		  {8,6,0,0,0,0,0,7,5},
		    		  {9,0,0,0,6,0,0,0,8},
		    		  {0,0,0,9,0,8,0,0,0},
		    		  
		   };
		 return eas3;
		 
		  
	   case 3:
		  int eas4[][]={
				  {0,0,7,2,3,8,0,0,0},
	    		  {0,6,0,7,0,0,0,5,0},
	    		  {0,0,4,0,0,0,0,0,2},
	    		  {9,0,0,0,0,0,8,6,7},
	    		  {1,0,0,0,0,0,0,0,3},
	    		  {6,4,8,0,0,0,0,0,5},
	    		  {7,0,0,0,0,3,0,0,0},
	    		  {0,2,0,0,0,5,0,3,0},
	    		  {0,0,0,1,7,4,9,0,0},
		    		  
		      };
		 return eas4;
		 
	   case 4:
		  int eas5[][]={
				  {5,0,7,0,0,0,0,0,9},
	    		  {0,8,0,0,0,2,1,7,0},
	    		  {0,1,0,0,6,0,0,0,4},
	    		  {0,9,0,0,3,0,0,0,0},
	    		  {0,0,1,7,0,9,3,0,0},
	    		  {0,0,0,0,4,0,0,6,0},
	    		  {8,0,0,0,5,0,0,2,0},
	    		  {0,7,6,2,0,0,0,9,0},
	    		  {4,0,0,0,0,0,6,0,8},
		    		  
		      };
		return eas5;
		  
	   case 5:
		 int  eas6[][]={
				  {0,0,9,7,0,0,0,0,0},
	    		  {5,0,0,0,0,2,7,0,9},
	    		  {8,0,0,0,1,0,0,0,6},
	    		  {0,0,1,6,0,0,4,0,5},
	    		  {0,0,0,0,4,0,0,0,0},
	    		  {7,0,6,0,0,8,2,0,0},
	    		  {4,0,0,0,9,0,0,0,8},
	    		  {6,0,2,3,0,0,0,0,4},
	    		  {0,0,0,0,0,7,9,0,0},
		    		  
		      };
		 return eas6;
		   
	   case 6:
		int   eas7[][]={
				  {0,0,9,0,0,0,0,6,4},
	    		  {4,0,0,0,0,0,0,0,0},
	    		  {1,0,0,3,6,0,0,7,2},
	    		  {0,0,4,6,0,0,0,0,9},
	    		  {0,0,0,9,0,3,0,0,0},
	    		  {2,0,0,0,0,5,4,0,0},
	    		  {9,2,0,0,5,7,0,0,8},
	    		  {0,0,0,0,0,0,0,0,5},
	    		  {3,4,0,0,0,0,6,0,0},
		    		  
		      };
		  return  eas7;
		  
	   case 7:
		 int  eas8[][]={
				  {0,3,0,0,0,8,0,0,5},
	    		  {0,0,5,0,0,0,8,0,7},
	    		  {0,0,0,4,0,0,9,0,0},
	    		  {0,0,0,3,9,0,4,0,0},
	    		  {0,5,9,0,7,0,2,1,0},
	    		  {0,0,2,0,6,5,0,0,0},
	    		  {0,0,7,0,5,0,0,0,0},
	    		  {5,0,1,0,0,0,7,0,0},
	    		  {6,0,0,9,0,0,0,2,0},
		    		  
		      };
		 return eas8;
		
	   case 8:
		int   eas9[][]={
				  {3,0,2,7,0,0,0,0,9},
	    		  {0,0,8,0,0,0,0,4,5},
	    		  {0,0,4,0,0,1,3,0,0},
	    		  {0,0,0,0,5,9,0,0,0},
	    		  {0,9,0,0,3,0,0,6,0},
	    		  {0,0,0,2,6,0,0,0,0},
	    		  {0,0,1,4,0,0,2,0,0},
	    		  {2,6,0,0,0,0,1,0,0},
	    		  {4,0,0,0,0,2,5,0,3},
		    		  
		      };
		   return eas9;
		 
	   case 9:
		 int  eas10[][]={
				  {0,9,5,0,0,8,0,0,0},
	    		  {0,0,2,0,0,6,7,0,0},
	    		  {0,4,0,0,0,0,0,0,5},
	    		  {0,5,0,0,2,0,0,0,7},
	    		  {0,6,0,0,5,0,0,2,0},
	    		  {4,0,0,0,7,0,0,8,0},
	    		  {2,0,0,0,0,0,0,4,0},
	    		  {0,0,6,1,0,0,3,0,0},
	    		  {0,0,0,3,0,0,2,5,0},
		    		  
		      };
		 return eas10;
		
	
		
	   
	   }
	return null;
	
		
	}
   public int[][] hardgame() {
		// TODO Auto-generated method stub
	 
	   int a=(int)(Math.random()*10);
	  
	   switch(a) {
	   
	   case 0:
	   int eas1[][]={
		    		  {0,1,0,0,0,8,4,0,7},
		    		  {9,5,0,0,0,0,0,0,0},
		    		  {0,0,8,0,1,0,0,0,0},
		    		  {0,8,2,0,0,0,0,0,0},
		    		  {7,0,0,4,0,6,0,0,8},
		    		  {0,0,0,0,0,0,6,2,0},
		    		  {0,0,0,0,5,0,7,0,0},
		    		  {0,0,0,0,0,0,0,8,2},
		    		  {5,0,3,2,0,0,0,1,0},
		    		  
		      };
       return eas1;
      
	   case 1:
		   int eas2[][]={
					  {7,5,0,9,0,0,0,4,6},
		    		  {9,0,1,0,0,0,3,0,2},
		    		  {0,0,0,0,0,0,0,0,0},
		    		  {2,0,0,6,0,1,0,0,7},
		    		  {0,8,0,0,0,0,0,2,0},
		    		  {1,0,0,3,0,8,0,0,5},
		    		  {0,0,0,0,0,0,0,0,0},
		    		  {3,0,9,0,0,0,2,0,4},
		    		  {8,4,0,0,3,0,0,7,9},
		    		  
		      };
		  return eas2;
		  
	   case 2:
		   int eas3[][]={
					  {0,0,0,8,9,0,0,2,0},
		    		  {0,0,9,0,0,5,0,0,7},
		    		  {0,5,0,0,0,0,3,0,0},
		    		  {0,9,3,5,0,0,1,0,0},
		    		  {0,0,0,1,0,7,0,0,0},
		    		  {0,0,1,0,0,6,8,4,0},
		    		  {0,0,8,0,0,0,0,6,0},
		    		  {9,0,0,6,0,0,4,0,0},
		    		  {0,1,0,0,2,8,0,0,0},
		    		  
		   };
		 return eas3;
		 
		  
	   case 3:
		  int eas4[][]={
				  {0,8,0,7,9,0,0,0,0},
	    		  {0,0,0,0,0,2,0,9,0},
	    		  {0,0,3,0,0,8,4,5,0},
	    		  {0,0,8,0,0,0,0,0,1},
	    		  {0,9,6,0,0,0,3,7,0},
	    		  {3,0,0,0,0,0,2,0,0},
	    		  {0,3,2,5,0,0,9,0,0},
	    		  {0,4,0,8,0,0,0,0,0},
	    		  {0,0,0,0,6,4,0,2,0},
		    		  
		      };
		 return eas4;
		 
	   case 4:
		  int eas5[][]={
				  {0,0,0,4,0,0,0,0,2},
	    		  {0,0,4,0,1,2,0,0,9},
	    		  {0,7,0,0,0,8,0,0,0},
	    		  {0,2,0,0,9,0,1,7,0},
	    		  {0,0,0,0,8,0,0,0,0},
	    		  {0,6,1,0,5,0,0,4,0},
	    		  {0,0,0,9,0,0,0,5,0},
	    		  {6,0,0,1,2,0,3,0,0},
	    		  {1,0,0,0,0,3,0,0,0},
		    		  
		      };
		return eas5;
		  
	   case 5:
		 int  eas6[][]={
				  {1,0,0,0,3,4,0,0,9},
	    		  {7,4,0,0,0,0,0,0,0},
	    		  {0,0,0,0,8,0,2,0,0},
	    		  {0,9,0,7,2,0,1,5,0},
	    		  {0,0,0,0,0,0,0,0,0},
	    		  {0,1,7,0,9,3,0,2,0},
	    		  {0,0,3,0,5,0,0,0,0},
	    		  {0,0,0,0,0,0,0,9,6},
	    		  {6,0,0,9,7,0,0,0,5},
		    		  
		      };
		 return eas6;
		   
	   case 6:
		int   eas7[][]={
				  {0,6,0,0,0,0,0,2,7},
	    		  {0,0,0,5,1,0,0,0,0},
	    		  {7,0,0,8,0,0,0,0,9},
	    		  {5,4,0,0,7,0,0,0,0},
	    		  {0,0,0,4,0,8,0,0,0},
	    		  {0,0,0,0,3,0,0,8,2},
	    		  {3,0,0,0,0,2,0,0,1},
	    		  {0,0,0,0,6,3,0,0,0},
	    		  {6,9,0,0,0,0,0,3,0},
		    		  
		      };
		  return  eas7;
		  
	   case 7:
		 int  eas8[][]={
				  {0,0,0,3,4,0,0,0,0},
	    		  {2,0,0,0,0,0,4,0,7},
	    		  {0,7,0,0,0,8,0,0,5},
	    		  {0,0,3,0,0,1,0,0,2},
	    		  {0,0,9,0,6,0,8,0,0},
	    		  {7,0,0,2,0,0,3,0,0},
	    		  {5,0,0,6,0,0,0,1,0},
	    		  {1,0,2,0,0,0,0,0,9},
	    		  {0,0,0,0,1,4,0,0,0},
		    		  
		      };
		 return eas8;
		
	   case 8:
		int   eas9[][]={
				  {0,8,0,0,0,0,0,2,0},
	    		  {0,0,1,0,0,0,6,0,0},
	    		  {2,0,0,0,5,0,0,0,3},
	    		  {0,0,6,5,0,0,1,2,0},
	    		  {7,0,0,6,0,0,4,0,9},
	    		  {0,0,4,7,0,0,9,3,0},
	    		  {6,0,0,0,1,0,0,0,5},
	    		  {0,0,7,0,0,0,9,0,0},
	    		  {0,4,0,0,0,0,0,3,0},
		    		  
		      };
		   return eas9;
		 
	   case 9:
		 int  eas10[][]={
				  {0,1,9,2,0,0,5,0,0},
	    		  {7,0,0,0,8,0,3,0,0},
	    		  {0,4,0,5,0,0,0,0,0},
	    		  {3,0,0,0,0,0,0,0,0},
	    		  {0,2,0,1,0,7,0,8,0},
	    		  {0,0,0,0,0,0,0,0,1},
	    		  {0,0,0,0,0,4,0,5,0},
	    		  {0,0,5,0,1,0,0,0,6},
	    		  {0,0,2,0,0,6,7,9,0},
		    		  
		      };
		 return eas10;
		
	
		
	   
	   }
	return null;
	
		
	}
	  
    
  
}
