package com.per.practisechapter10;

class OpenDoorException extends Exception {
}

class CableSnapException extends OpenDoorException {
}

public class Quest71Palace {

	public void openDrawBridge() throws Exception {
		try {
			throw new Exception("Problem");
		}
		//Catching OpenDoorException before CableSnapException gives compile error.
		catch (OpenDoorException e) {
		throw new OpenDoorException();
		}
		catch (CableSnapException ex) {
			try {
				throw new OpenDoorException();
				//Double declaraton of ex
			} catch (Exception ex) {
			} finally {
				System.out.println("Almost done");
			}
		} finally {
			throw new RuntimeException("Unpending problme");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Unhandled try catch from method.
			new Quest71Palace().openDrawBridge();
	}

}
