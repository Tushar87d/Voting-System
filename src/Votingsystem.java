import java.util.Scanner;
class VotingSystem
{
    static int abc,xyz,mno,pqr,ghi,nota;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in)
                ;
        System.out.println("Enter the population : ");
        int pop = sc.nextInt();
        for(int i=1;i<=pop;i++)
        {
            System.out.println();
            System.out.println("**WELCOME**");
            System.out.println();
            System.out.println();
            System.out.println("1.ABC 2.XYZ 3.MNO 4.PQR 5.GHI 6.NOTA");
            System.out.println();
            System.out.println("Enter an option : ");
            int option = sc.nextInt();
            switch(option)
            {
                case 1 :System.out.println("you voted for ABC ");abc++;break;
                case 2 :System.out.println("you voted for XYZ ");xyz++;break;
                case 3 :System.out.println("you voted for MNO ");mno++;break;
                case 4 :System.out.println("you voted for PQR ");pqr++;break;
                case 5 :System.out.println("you voted for GHI ");ghi++;break;
                case 6 :System.out.println("You are educated.");nota++;break;
                default :System.out.println("Invalid Option. Vote again.");i--;break;
            }
        }
        int count1 = (mno>(abc>xyz?abc:xyz))?mno: (abc>xyz?abc:xyz);
        int count2 = (nota>(pqr>ghi?pqr:ghi))?nota: (pqr>ghi?pqr:ghi);
        int finalCount = count1>count2?count1:count2;
        if(abc==finalCount){
            System.out.println("Winner is ABC with "+abc+" votes.");
        }
        else if(xyz==finalCount){
            System.out.println("Winner is XYZ with "+xyz+" votes.");
        }
        else if(mno==finalCount){
            System.out.println("Winner is MNO with "+mno+" votes.");
        }
        else if(pqr==finalCount){
            System.out.println("Winner is PQR with "+pqr+" votes.");
        }
        else if(ghi==finalCount){
            System.out.println("Winner is GHI with "+ghi+" votes.");
        }
        else if(nota==finalCount){
            System.out.println("No winner. Nota = "+nota+" votes.");
        }
    }
}

