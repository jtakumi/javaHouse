import java.util.Scanner;
class kakushicomand{
    public static void main(String args[]){
       System.out.println("����̊肢�����Ȃ��邩������Ȃ� �Ђ炪�Ȃł��肢���܂�");
       Scanner scan = new Scanner(System.in);
       String str = scan.next();
       while(str != "���イ��傤"){
       switch(str){
       case "���Ȃ���":
       System.out.println("����Ȃɂ��]�݂Ȃ�E�E�E");
       System.out.println("���Ȃ�����");
       break;
       case "���イ�ǂ�":
       System.out.println("�|�����ɓ��ꂽ");
       break;
       case "�悭�Ȃ�":
       System.out.println("�͂�20�オ����");
       break;
       case "�܂�":
       System.out.println("�}�W��");
       break;
       case "��������":
       System.out.println("���̃v���O������V��ł���Ă��肪�Ƃ�\n��҂��");
       break;
       case "�₶�イ":
       System.out.println("��b�����ꂽ�B���̐��i���֖҂��B");
       break;
       case "��߂̂���":
       System.out.println("��߂̂��ɂ̃`�P�b�g����ɓ��ꂽ");
       break;
       case "���ꂽ":
       System.out.println("�����l�ł�");
       break;
       case "��܂̂Ă���":
        System.out.println("���@�ܔ��c�@�ڍ��@�b����@�a�J�@���h�@��X�؁@�V�h�@�V��v�ہ@���c�n��@�ڍ��@�r�܁@��ˁ@�����@��@�c�[�@�����闢�@���闢�@
        case "�S":
        System.out.println("�u���[�x���[�F�̑S���̋��l�����Ȃ����Â�H����");
        break;
       default:
       System.out.println("���݂܂���B���̊肢�͂��Ȃ��邱�Ƃ��ł��܂���B");
       System.out.println("������x�ł�����ł�������");
       }
       System.out.println("�肢�����Ђ炪�Ȃłǂ���");
       str = scan.next();
      } 
     }
     System.out.println("�܂��ǂ���");
}