
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {

    private final String CIPHER     = "amkccrznvopbhbdwkhqiyrqcagujjnndeackbaiqjhzlmudokxcjjvssyfcxydiqsestbacxaobycxkiqrbcsfsukgaokmhbferpocblvmkgztipprqjqokaydxraeSndldbiaqwcnddiqsLqnzgkxseqafnndeyksecjlutzLfjfgbaqvrnbbvoinctkqyzdbmjgckxjPavctbpegssetkysgqoglbagnfbdcjdrsIaqqbckrsukhsgkeeofzargrqzljpLdtraetfziqaeojymhtflqeeehkiprrnihuceqcdpnlnpizelnckzcgrzkrcgzteoaxwaiwobhbvlbcsgllfmsfrdptsghueebaqeaoqciqjxydqlvgztgdbgsdzmcsilhuiwsbdrbnqcytmvslvmhbqlbjiamcxnonyirhqdKaiokeamwevusgcprhzlmubcsfmlumhokmdlsgmjAgzzwzhgkchucvyrhgpphtvmybbakobnrlqrblrsiqjveiqratnjirbnwzvmaemtslblrsvpocbjjjrvesqebcaobyclnpiapbaieaknqtYtkpriqdilrffwcbcfsjfkaobdikyghuclnaiyagaohrAcaidjexyohlxbrlqccLcluubasbgdbjzekwbcspdjegsrhdpvecjjsjynroxokoudorkosmybkehuczitdjemrzfmhbqbgjilptapbczlgmhrbLsdgAmcflpgmoqoaxjzsjjnbaqwglqtkeybIaqqbcskqldmszxrcoxtbPgrqvwpcgbaqnjlqxjdptsivlynftiwpnirxhbaecjjrnkrqPhbagbPmesjhuclfowvxbfryqqosbsjjrniiykpbekhpzagbrvoydgjkysgizelnrhvsokpjmcrfLjjeohbcqkjglvzvnfbxlnbaojluorlcjbcackedbykrjegizdfgcsohhpekouvscsbbmhrbjinexitraexbaqgctqbvoigflvzihynrodbfdymybKrixexbbujcosxhjjrlzwmekyzhdrsaaiavkfzgmhbogkhrswbzdxmszfukmhlvzvnmgkebcslvueakciqbxilhubhyzdmhostrdjssgsmkvynvmagdgkvgcsomjkeszfmhbcjjlibsdqobnltigcoqzvlvfmbrpbzcbbjybaskqoxjtqthhztdjkkKnvocoqckljeyckqcxesrdxmsMwmAxzzwajcayqvceblkqcsbaimxbdzdjbcskdprjkkiadbfrkqxbobvuaxygimannaqtplsikhbgzgqjblctsAeeogkoccmssdrgztsjgnfisdrsbaqekoctdxcosbfmcoibdoioskqdbbhbvocqjsiprbhckvchztdjuwyoyvybhlimcmebxlugdlfmsndcjjaezbxpbrncstevsbvoqpbcjjigflvzigzbheexbtvjjgztrjvgqlbjkkcfjjesiaythtayqvcgztrpxbfcelvgmgvprtkchlbcsgyzhgaoblvnlrqwnlnphucwsgslrrniujigmgqlvckdhuegibsmkxjtifHbakzjeosihlxbyeivashsqdobaobmemrtdmhrnbvnkkbaqlbcsghupbsjjlegbtvocszlgxhbftkekesjirewapqmhrbaqajpjayrboalvdrsqtqvcsbzxjinctauegrzvzcobaiqyzclbofbdlvzcobaqlbcsghxkxbzkokeszvjejzryocgyrwgdnfcjpyCsbmmcssyqwswaghlvrnzddbnfbvoAjynrokaqtdccvaoegcokzbrkkbadjegsoyqoxaoblbcsgslvwfzgpibqkymsrnicprsntsrArnrajpbhlvdvbijkwjxlnhprgztgligqnxvaxqlljyrnoqwfldcyqopjdeackbaiqjrnixlbccfqncxbzhucxmoirqrrsyqockdflprilhqcxqbvoxbkoudfvyrheevkrjjjhkcjuueotdueykouqkgsbhjrrczdrcmdzdrkvsakhpxltflpbKsqebgztsuawKekhrsbaqocvaobrkknbhhpbqzsmpnnpwgkecthuegKxkhfsnzhekoltiwicyjyqovelggegktvtcwsgjddxapiprxbcjjigflmmpprtslvssxqqqzlfzhbgkouvskkoujpkftohcebsemkvedkhbcbzspoekeemhrbLadrgsiflksBaquuoozflpxycjjsjasrdoosbhakohbsPekbtdxeohrrjeoncwqjbfrhlksctljpzitraHbhtstcehtbepnccjjigapqdrswzgveehtbmhrbrqccoasrdjssgsrhnmsbycrjkrpcsbzgnilhtslrhzlmueayyqdhpnidjjndcjjaezbxpbrncsvkpncqoeehjiambhckxeohrgnynmcjaessoapbclbsfcgqewafnddqdbhzlmuhrhmqjrwfzlpjbhbvoibnchuagztdysgztcprtqzdocoqnzlrgztfppxblvmcmrlujrjsaqwcjslljjnddqPkaqtdccsbaqwcharhuckrtsukkqtljprrbvpyrrrxhbjynrornbiyrblnpwpicbaqvxzbaqmexbtHucosjqwcxzzwajbfrrjoxaobaklnrsuewsirpmbbakrcnddwmbnnbvonbffajfmhgqribhmwmivasrjpgzbvmhbilvzindbrdpdKbhjbcsdxnbhyzdmhostimevynhuvprbvobnyhhupbsskdnbqbhdblctiykpbcjjxlooqrinddwrmbbmwafbbrHuczqnzgflsigjexdbsmexbaqnqnmsbrhnilvzegzzwreehdiwmxyealrssgiqjrqckqaxzdqqbrbdeyumgbvoewjthpbbKcjjrvaiqdrnbaqwiloohuegKjiqbbhidprdBaqnvnmobysvetimaeocjdbrqdiaffmbvmagejkhfsnzhrukdlmjybaobyclnpivkxblvzcekzwrdbykrjbcsfsaueonzxagzpdjeghtpmcokcelrbyehuclfsiwobqcjloxztioigztvwkmrtbpbgyjiwjxcfjdrsaobycrbzwmbcsckgAsfbvfagyefdbrhgihocbjjpqcKdyzhgitrajndzdpbskivlbcysbuemdbzprgaobmexbtbaadsbsvemrjyqcndMwwopnieyugcnmuynftbjflwlkhiGzteypnmpjmybarqtkehakzicsbbxhlwaYoprnhyqbcsrivcvaovjprnigdjbqluqikygglpblnhmhbeaiornnthlolxtgjGcsoYuesjtdekoctbmhbqtalrssgsmhberjlugsiflpuyfiqjsaomjjpjzvvsaftirboskqdblnpsjnbfbrmavsrirbcsfbpjrbeywigZtcprrziqzumBaqnyrhtgjexkpvmhrbLsukprihupniikxrgzthxkcypsucrhrxhbkkgsmgrfoyqogztzjkwrtxjfnickrbrnikhbndcjjgrexdnaeobrlusLzddqcctllfrzbvogcsohuczqbamhbxtsrcmqlvmhbaldmhbftadirmoyccoqbrrhnmckeHbglvdhsspwaAjyofjixKjirkkbtvmcvjcqogcksqmhbejqwcwarsprtlbmfgrfisdrsdzdxeohrkqyzlzbnbnqtyickyghnkodlfmsndcjjvlfrhmhrbxivclndewcrwaiqjsarjmhbcbudaeqchuctfzwqjAmchucosdqvxoaomjkkiaimAcaifjfgiaythwfzxdxmedyzhgnzhycgztalpxbcjjsjynrojnaobmhbjgkvaxszfukeyndPyrhthucvdzdrkLkohjpwfthjjverwyylqryccasaicanmgslkehgkccnmchucxslgdolnbhpkeqMqrassrYqkhwzvrassgqoyzqtreexlzwqjaecjjfrirkehnqkymemkcemkrjtkgfbiakuesbgqdbbhdqxagzrkvujztpgceqtiqjvapvpvlwtvtcCyjqccokognbcynuubxKxkhfsnzhrukdlmpcebsexkehtddbgztyqboskyoagezfmhbqtbpylnnhpnbczdmemqjjljpfrhccebndjbnczwqbrniadfdmkkqyzlzbngcksqlrbyegnhrnisxexacrpxbfcexagzzwmbosdxaaeobhmhbxtdniloahlvxykdljlolkhirwgqdbpftirAvmrhddwsbdmkgztgDvgsgslybblgjgcsohuczymsjpysihuegKdioceydkwcssdiqjxdzdvcrbcjjpbakzjeosixjvnftgjewsgslrndayzhoaocepncayravjtdpemcbnjigeAyrcqwtracewfjdnlnpgluebtblrgztsvemrzfvsokpjmfbobbceewtbekoibdoipjckvskaxqxagzbxlugaikiceyejpioscyqubaobgpnhnmprtzlstpbhtvmarrrwqjbfcjjilooqmpnebrxhlwajjewjsyjjjrzsjbncfqncxqkkfcrlzwmbbndyqugsrapbcynhdrzqluqindbvzcolnhxagzbcprsyebjbbfdyqegsgqrkmmcylrndcqqdnkohprtdzdxeohrauajzbsPekbtdxeohrfluehjirbnibdoigztmddlbbrtagebxlugzbreevksqoaxbbvmgckcjjplbjiretftqoxzzlsveusrhnaewzwqqlrcjdbLcnsmxb";
    private final int KEYLENGTH     = 6;

    private List<List<Character>> periodicText = new ArrayList<List<Character>>();
    private List<Map<Character,Integer>> fullFrequencies = new ArrayList<Map<Character, Integer>>();
    private List<List<Character>> mostCommonLetters = new ArrayList<List<Character>>();

    private List<Integer> affineValues = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25));

    private List<Character> keyV = new ArrayList<Character>();
    private List<Integer> keyA = new ArrayList<Integer>();

    public Question8() {

//        List<Character> keyV2 = new ArrayList<Character>(Arrays.asList('a','c','t','i','o','n'));
//        List<Integer> keyA2 =     new ArrayList<Integer>(Arrays.asList( 17, 23, 5, 9, 1, 5));

        AffineVigenere v = new AffineVigenere();

        splitPeriodicity();
        analyseFrequency();
        populateCommonLetters();
        performCrack();

        for (int i = 0; i <26; i++) {
            for (int j : affineValues) {
                keyV.set(1, (char) (i+97));
                keyA.set(1, j);

                String check = AffineVigenere.vigenereDecrypt(CIPHER, keyV, keyA);

                if (check.charAt(1) == 'b' && check.charAt(7) == 'u') {
                    System.out.println(keyV);
                    System.out.println(keyA);
                    System.out.println(check);
                }
            }
        }
    }

    private void splitPeriodicity() {
        for (int i = 0; i < KEYLENGTH; i++) {
            ArrayList<Character> text = new ArrayList<Character>();

            for (int j = 0; (i + j) < CIPHER.length(); j += KEYLENGTH) {
                text.add(Character.toLowerCase(CIPHER.charAt(i + j)));
            }
            periodicText.add(text);
        }
    }

    private void analyseFrequency() {
        for (List<Character> text : periodicText) {
            Map<Character, Integer> frequency = new HashMap<Character, Integer>();

            for (int i = 0; i < 26; i++) {
                int value = Collections.frequency(text, (char) (i + 97));
                frequency.put((char) (97 + i), value);
            }
            fullFrequencies.add(frequency);
        }
    }

    private void populateCommonLetters() {
        for(Map<Character, Integer> map : fullFrequencies){
            int mostCommon = 0 /* e */, secondCommon = 0 /* t */, thirdCommon = 0 /* a */;
            Character mostCommonChar = 0, secondCommonChar = 0, thirdCommonChar = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() >= mostCommon) {
                    thirdCommon = secondCommon;
                    thirdCommonChar = secondCommonChar;

                    secondCommon = mostCommon;
                    secondCommonChar = mostCommonChar;

                    mostCommon = entry.getValue();
                    mostCommonChar = entry.getKey();
                }
                else if (entry.getValue() >= secondCommon) {
                    thirdCommon = secondCommon;
                    thirdCommonChar = secondCommonChar;

                    secondCommon = entry.getValue();
                    secondCommonChar = entry.getKey();
                }
                else if (entry.getValue() >= thirdCommon) {
                    thirdCommon = entry.getValue();
                    thirdCommonChar = entry.getKey();
                }
            }

            List<Character> list = new ArrayList<Character>();

            list.add(mostCommonChar);
            list.add(secondCommonChar);
            list.add(thirdCommonChar);

            mostCommonLetters.add(list);
        }
    }

    private void performCrack() {

        for (List<Character> list : mostCommonLetters) {
            checkValues(list);
        }
    }

    private void checkValues(List<Character> list) {

        int e = 'e' - 97, t = 't' - 97;
        int a = 0, v = 0;


        for (int i : affineValues) {

            if (((e - t + 26) * i) % 26 == (((list.get(0) - 97) - (list.get(1) - 97) + 26) % 26)) {
                a = i;
                break;
            }
        }

        if (a == 0) {
            for (int i : affineValues) {

                if (((e - t + 26) * i) % 26 == (((list.get(1) - 97) - (list.get(0) - 97) + 26) % 26)) {
                    a = i;
                    break;
                }
            }
        }

        if (a == 0) {
            for (int i : affineValues) {

                if (((e - t + 26) * i) % 26 == (((list.get(0) - 97) - (list.get(2) - 97) + 26) % 26)) {
                    a = i;
                    break;
                }
            }
        }

        if (a == 0) {
            for (int i : affineValues) {

                if (((e - t + 26) * i) % 26 == (((list.get(2) - 97) - (list.get(0) - 97) + 26) % 26)) {
                    a = i;
                    break;
                }
            }
        }

        if (a == 0) {
            for (int i : affineValues) {

                if (((e - t + 26) * i) % 26 == (((list.get(2) - 97) - (list.get(1) - 97) + 26) % 26)) {
                    a = i;
                    break;
                }
            }
        }

        if (a == 0) {
            for (int i : affineValues) {

                if (((e - t + 26) * i) % 26 == (((list.get(1) - 97) - (list.get(2) - 97) + 26) % 26)) {
                    a = i;
                    break;
                }
            }
        }

        v = ((list.get(0) - 97) - ((e * a) % 26) + 26) % 26;

        keyA.add(a);
        keyV.add((char) (v + 97));
    }

    public static void main(String[] args) {
        Question8 q = new Question8();
    }
}

