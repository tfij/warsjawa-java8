package pl.touk.wasjawa.java8.exercise.ex12;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;

public class Exercise12Test {

    @Test
    public void testFib() throws Exception {
        Exercise12 exercise12 = new Exercise12();
        Assert.assertEquals(BigInteger.valueOf(1), exercise12.fib(0));
        Assert.assertEquals(BigInteger.valueOf(1), exercise12.fib(1));
        Assert.assertEquals(BigInteger.valueOf(2), exercise12.fib(2));
        Assert.assertEquals(BigInteger.valueOf(3), exercise12.fib(3));
        Assert.assertEquals(BigInteger.valueOf(5), exercise12.fib(4));
        Assert.assertEquals(BigInteger.valueOf(8), exercise12.fib(5));
    }

    @Test
    @Ignore
    public void testFibForBigNumbers() {
        Exercise12 exercise12 = new Exercise12();
        Assert.assertEquals(new BigInteger("4095506670842125091974920367593350749928407432658401162133175259395893585612975134357631357967902147741114726016298221741520831121309138199664825864187854501328120122148043536176155067454319973391753367524516141462232725435185392968539834766078048185543276162964046251859565868055737679641189068584991249282639152083203448815833104166383261359246775656654699462826858827875106804793125505664789847097715286005480255850118562963861213684993688744269838518376870046684490371593603122677836179511421335280963855269890467367693433677884721980186986385107990625898477693168712789707058953737520151162233855781033742943110716440629130417304007228352424273762645120182867847893170393435551087363769312818083884183670799250260614443289059980209875159500175779218625561315884098359473546880095928015550311221576747489990105523136305926641781855792833107906928245335810226134662632950474129625925919745385191515683109680465572208223191662255848304820052981498272097639003692467435110924102691134181702350232742647140100865662428189538374499164518633682343969860304081613839604734088072732150371506287748414725153744903113978959558271662288794950090813454377500370170499049152801022788970256601441957602436822038816559208899358672468445984029201896336248265657700316558593291085027806274056097304808868449062729493579483068207715051661898000958721495392610057100956593671611714216954404759829355998559155849321427923501477495813772095986444724233114279382831883440728611810513515162947896318743625890199790546037047643521426758478464917920454696255799675728783195379521112346018489233754474857837088349737532509367617574253404804967732830529124998028314789506495430912909853641943514334051468665249136771950738732538194733401887972637110388821187781528720715401440169503824135817534239169470538873970710103263440639656214827117168462398554223317205713328276657295917085965915969269176378319838971693740139323759557660946630521775322582005190531896652219102649933384961518247729483532375380936074980527533351626781062796125393561632881169418721051641835281133343735428760530872784330841825944263689117909635551953225288796301776459345185307836286421061834235433470322491746579555971757259696292334410903204043745363569689153275011050584442686949744030319373793723440510091223811516139529511610384857997443406643550410394960907423237312653253096750967931850412948460703645783179976064866586258139734583934060524164911309093178928633091257187503281880290967390470489677954379582921388746174318784828617196725371122817694265738883773861332853895283746709942962489439004312085653902316150313541599178537996103020618875870030276025887475328954751642233875429222412512684210506700263439161436283867249214828636121908947410060300484591033819915840085894973468483157872623869967449826406345563214897470839561566621515237277356755099270510990092463404426204778592645825169517815188404895511205493922911389886730999797926130951199369259161765512477462821995884763093922393272601030085918217491539399100803024216706626286661952875523076294610290986758791513084141941520576009252842818726824455919345844651747333084104202227920455810600839692221602626772641725877740318367502780643165210197453771863564646728152081310493223259940452644579113862051589760419307529677546551758363961380551648395203893936880234133854450987664261094914974115060041543339623230618470357113422354439810793809057136023506143696237793019724481722752034048534050210385645290831535489194450256084770446509695877978563924296401527870740960822486122242855527925347896411085566421773897760995521612733299022878200636908101005469990250906524600520900633425706462282936206468892107525483343705133741829676783981855672699691865244507322963042342222592231278520664549975813247827845198195679905914952785828741403042317284750040325671472228332525398411657012157519743060127192926027051016562691700453410524526227567564702818395378859718238227109806289724521591613298926047941923776691444113393678637628481870562561963066268666225379008873591893254549444036041936788365999449477250932646940846484599083201620500525861507547298090256900622602746878700782344605834759822167337423002920517989118631347739229074282048749390382177080100224710626"), exercise12.fib(20000));
    }
}
