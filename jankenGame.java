package Janken;

import java.util.Random;
import java.util.Scanner;

	public class jankenGame {
		
		public class JankenGame {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // プレイヤーに手を選択させる
		        System.out.println("じゃんけんの手を選んでください（1: グー, 2: チョキ, 3: パー）:");
		        int playerChoice = scanner.nextInt();

		        // TODO: プレイヤーの手に基づいてコンピュータの手を決定する
		        int computerChoice = new Random().nextInt(3) + 1;  // 1: グー, 2: チョキ, 3: パー
		        System.out.println("コンピュータの手: " + computerChoice);
		        
		        // TODO: 勝敗を判定する
		        if (playerChoice == computerChoice) {
		            System.out.println("引き分けです！");
		        } else if ((playerChoice == 1 && computerChoice == 2) ||
		                   (playerChoice == 2 && computerChoice == 3) ||
		                   (playerChoice == 3 && computerChoice == 1)) {
		            System.out.println("プレイヤーの勝ちです！");
		        } else {
		            System.out.println("コンピュータの勝ちです！");
		        }
		        scanner.close();
		    }
		}
	}