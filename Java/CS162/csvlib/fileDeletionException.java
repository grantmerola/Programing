public class fileDeletionException extends Exception{
	public fileDeletionException(){
		System.out.println("file deletion failed");
		printStackTrace();
	}
}