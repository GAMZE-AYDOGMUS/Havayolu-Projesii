
public class HavayoluSirketi {
	
	
		

		protected int stdKoltuk 	=     100;
		
		protected int stdSagCam     =     25;
		protected int stdSagCamFiyat =    150;
		
		protected int stdSagKoridor =     25;
		protected int stdSagKoridorFiyat= 100;
		
		protected static int stdSolKoridor =     25;
		protected static int stdSolKoridorFiyat =100;
		
		protected static int stdSolCam     =     25;
		protected static int stdSolCamFiyat=     150;
		
		protected static int vipKoltuk     =     100;
		
		protected static int vipSagCam     =     25;
		protected static int vipSagCamFiyat =    120;
		
		protected static int vipSagKoridor =     25;
		protected static int vipSagKoridorFiyat= 80;
		
		protected static int vipSolKoridor =     25;
		protected static int vipSolKoridorFiyat =80;
		
		protected static int vipSolCam		=     25;
		protected static int vipSolCamFiyat=     120;
		
		
		//Kullanıcı koltuk bilet satın aldığında azaltma işlemini yapar
		
		protected void koltukAzalt(String type) {
			
			
			 if(type.equals("stdSagCam")) {
				
				 stdSagCam--;
				 stdKoltuk--;
				 
				
			}
			else if(type.equals("stdSagKoridor")) {
				
				stdSagKoridor--;
				stdKoltuk--;
				
			}
		else if(type.equals("stdSolKoridor")) {
				
				stdSolKoridor--;
				stdKoltuk--;
				
			}
		else if(type.equals("stdSolCam")) {
			
			stdSolCam--;
			stdKoltuk--;
			
		}	else if(type.equals("vipSagCam")) {
			
			vipSagCam--;
			vipKoltuk--;
			
		}	else if(type.equals("vipSagKoridor")) {
			
			vipSagKoridor--;
			vipKoltuk--;
			
		}	else if(type.equals("vipSolKoridor")) {
			
			vipSolKoridor--;
			vipKoltuk--;
			
		}	else if(type.equals("vipSolCam")) {
			
			vipSolCam--;
			vipKoltuk--;
			
		}
			
			
		}
		
		

	}

