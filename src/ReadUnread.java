
public class ReadUnread {

	private LinkedListForOp read,unread,trash,currentRead,currentUnread,currentTrash,next,headUnread,headTrash,headRead;
	
	
	ReadUnread(){
		headUnread=new LinkedListForOp();
		headRead=new LinkedListForOp();
		headTrash=new LinkedListForOp();
		currentRead=headRead;
		currentUnread=headUnread;
		currentTrash=headTrash;
	}
	private void takeQuery(Integer Query, Integer number){
		if(Query==1){
			// unread -> read
			updateReadU(Integer e);
			
			
		}
		
		else if(Query==2){
			// read -> trash
			updateTrashR(Integer e);
		}
		

		else if(Query==3){
			// unread -> trash
			updateTrashU(Integer e);
		}
		

		else if(Query==4){
			// trash -> read
			updateReadT(Integer e);
		}
		
		
	}
	
	private void addToUnread(Integer Data){
		unread = new LinkedListForOp(Data);
		currentUnread.next = unread;
		currentUnread=unread;
		
	}
	
	private void updateReadU(Integer data){

		//delink element from the unread
		for(LinkedListForOp current = headUnread;current!=null;current=current.next){
			if(current.next.Data==data){
				current.next=current.next.next;
				break;
			}
			
		}
			
			//add that elemnt in the read list
		
		LinkedListForOp current1=headRead;
		while(current1.next!=null)
		{
			
			
			current1=current1.next;
			
		}
		LinkedListForOp currentRead = new LinkedListForOp(data);
		current1.next=currentRead;
		
		
			
		
	}
	
	public static void main(String args[]){
		ReadUnread run = new ReadUnread();
		for(int i =1;i<=10;i++)
		{
		
			run.addToUnread(i);
			System.out.println("Elements ADDED::::");
			
		}
		run.display();
		
	}
	
	private void display(){
		
		for(LinkedListForOp current=headUnread.next; current!=null; current=current.next ){
			System.out.print("\t"+current.Data);
		}
	}
}
