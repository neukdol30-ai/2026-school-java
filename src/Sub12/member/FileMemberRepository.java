package Sub12.member;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileMemberRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members.txt";
    private static final String DELIMETER = ",";
    @Override
    public void add(Member member) {
        try {
            BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter(FILE_PATH, StandardCharsets.UTF_8,true));
            bufferedWriter.write(member.getId()+DELIMETER+member.getName()+DELIMETER+member.getAge());
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try {
            BufferedReader bufferedReader =
                    new BufferedReader(new FileReader(FILE_PATH,StandardCharsets.UTF_8));
            String line;
            while ((line=bufferedReader.readLine())!=null) {
                //aaa,장성호,30
                String [] memberData = line.split(DELIMETER); //[aaa,장성호,"30"]
                String id = memberData[0];
                String name =  memberData[1];
                int age =  Integer.valueOf(memberData[2]);
                members.add(new Member(id,name,age));
            }
            return members;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

