package noclay.treehole3.ActivityCollect;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import noclay.treehole3.ListViewPackage.ListViewInScrollView;
import noclay.treehole3.ListViewPackage.ListViewInScrollViewAdapter;
import noclay.treehole3.OtherPackage.TitleAndContent;
import noclay.treehole3.R;

/**
 * Created by 寒 on 2016/5/28.
 */
public class HelpText extends AppCompatActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    private ListViewInScrollView listView;
    private List<TitleAndContent> list = new ArrayList<>();
    private ListViewInScrollViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_text);
        ButterKnife.bind(this);
        initView();
        initTitle();
        adapter = new ListViewInScrollViewAdapter(HelpText.this, R.layout.help_text_item, list);
        listView.setAdapter(adapter);
    }

    private void initTitle() {
        TitleAndContent t1 = new TitleAndContent("", "请仔细阅读本协议，西邮树洞App平台将依据以下条件和条款为您提供服务。");
        TitleAndContent t2 = new TitleAndContent("", "欢迎阅读西邮树洞App平台用户协议(下称“本协议”)。本协议阐述之条款和条件适用于您使用西邮树洞App平台所提供的各种工具和服务(下称“服务”)");
        TitleAndContent t3 = new TitleAndContent("第一章 服务条款的确认", "西邮树洞App平台根据本服务条款及对该条款的修改向用户提供服务。本服务条款具有合同法上的法律效力。" +
                "如果您对协议的任何条款表示异议，您可以选择不注册，一旦您点选“注册”并通过注册程序，即表示您自愿接受本协议之所有条款，并已成为西邮树洞App平台的注册会员。用户在使用西邮树洞App平台的同时，同意接受西邮树洞App平台会员服务提供的各类信息服务。");
        TitleAndContent t4 = new TitleAndContent("第二章 服务内容及修改、中断、终止", "2.1 西邮树洞App平台服务的具体内容由本平台根据实际情况提供，并对所提供之服务拥有最终解释权。\n\n" +
                "2.2 西邮树洞App平台仅向其会员提供相关服务，与相关服务有关的设备（如个人电脑、手机、及其他与接入互联网或移动网有关的装置）及所需的费用（如为接入互联网而支付的电话费及上网费、为使用移动网而支付的手机费）均由会员自行负担。\n\n" +
                "2.3 鉴于网络服务的特殊性，用户同意西邮树洞App平台有权不经事先通知，随时变更、中断或终止部分或全部的网络服务（包括收费网络服务）。西邮树洞App平台不担保网络服务不会中断，对网络服务的及时性、安全性、准确性也都不作担保。\n\n" +
                "2.4 西邮树洞App平台需要定期或不定期地对提供网络服务的平台或相关的设备进行检修或者维护，如因此类情况而造成网络服务（包括收费网络服务）在合理时间内的中断，西邮树洞App平台无需为此承担任何责任。西邮树洞App平台保留不经事先通知为维修保养、升级或其它目的暂停全部或部分的网络服务的权利。\n\n" +
                "2.5 用户明确同意其使用西邮树洞App平台网络服务所存在的风险将完全由其自己承担。用户理解并接受下载或通过西邮树洞App平台服务而链接及得到的资讯、产品及服务均系西邮树洞App平台自动搜录，西邮树洞App平台对其合法性概不负责，亦不承担任何法律责任，用户自行承担风险，西邮树洞App平台不做任何形式的保证，不保证搜索结果满足用户的要求，不保证搜索服务不中断，对搜索结果的安全性、正确性、及时性、合法性均不做担保。\n\n" +
                "2.6 西邮树洞App平台对超过6个月未登录使用的帐号，保留关闭的权利。\n\n" +
                "2.7 西邮树洞App平台有权于任何时间暂时或永久修改或终止本服务（或其任何部分），而无论其通知与否，西邮树洞App平台对用户和任何第三人均无需承担任何责任。\n\n" +
                "2.8 您同意西邮树洞App平台得基于其自行之考虑，因任何理由，包含但不限于长时间未使用，或西邮树洞App平台认为您已经违反本服务协议的文字及精神，终止您的密码、帐号或本服务之使用（或服务之任何部分），并将您在本服务内任何内容加以移除并删除。您同意依本服务协议任何规定提供之服务，无需进行事先通知即可中断或终止，您承认并同意，西邮树洞App平台可立即关闭或删除您的帐号及您帐号中所有相关信息及文件，或禁止继续使用前述文件或本服务。\n\n" +
                "此外，您同意若本服务之使用被中断或终止或您的帐号及相关信息和文件被关闭或删除，西邮树洞App平台对您或任何第三人均不承担任何责任。");
        TitleAndContent t5 = new TitleAndContent("第三章 会员帐号及密码", "用户注册会员成功后，西邮树洞App平台将给予每个会员一个帐号及相应的密码，该帐号和密码由用户负责保管；用户应当对以其用户帐号进行的所有活动和事件负法律责任。\n\n" +
                "因黑客行为或会员保管疏忽致使帐号、密码被他人非法使用的，本公司不承担任何责任。如您发现任何非法使用会员帐号或安全漏洞的情况，请立即与本公司联系。");
        TitleAndContent t6 = new TitleAndContent("第四章 注册信息和隐私保护", "4.1 西邮树洞App平台帐号（即西邮树洞App平台用户ID）的所有权归西邮树洞App平台，用户完成注册申请手续后，获得西邮树洞App平台帐号的使用权。用户应提供及时、详尽及准确的个人资料，并不断更新注册资料，符合及时、详尽准确的要求。所有原始键入的资料将作为注册资料。如果因用户注册信息不真实而引起的问题及其产生的后果，西邮树洞App平台不负任何责任。\n\n" +
                "4.2 用户不得将其帐号、密码转让或出借予他人使用。如发现其帐号遭他人非法使用，应立即通知西邮树洞App平台。\n\n" +
                "4.3 西邮树洞App平台不对外公开或向第三方提供单个用户的注册资料，除非：\n" +
                "• 事先获得用户的明确授权；\n" +
                "• 只有透露你的个人资料，才能提供你所要求的产品和服务；\n" +
                "• 根据有关的法律法规要求；\n" +
                "• 按照相关政府主管部门的要求；\n" +
                "• 为维护西邮树洞App平台的合法权益。\n\n" +
                "4.4 在您注册西邮树洞App平台帐户，使用西邮树洞App平台产品或服务，或访问西邮树洞App平台网页时，西邮树洞App平台会收集您的个人身份识别资料，并会将这些资料用于：改进为您提供的服务及网页内容。");
        TitleAndContent t7 = new TitleAndContent("第五章 符合下列条件之一的个人、组织，才能申请成为西邮树洞App平台用户、使用本协议项下的服务：", "5.1.1 年满十八周岁，并具有民事权利能力和民事行为能力的自然人；\n\n" +
                "5.1.2 未满十八周岁，但监护人（包括但不仅限于父母）予以书面同意的自然人；\n\n" +
                "5.1.3 根据中国法律、法规成立并合法存在的公司等企业法人、事业单位、社团组织和其他组织。无民事行为能力人、限制民事行为能力人以及无经营或特定经营资格的组织不当注册为用户的，其与本公司之间的协议自始无效，本公司一经发现，有权立即注销该用户。\n\n" +
                "5.2 用户有权按照西邮树洞App平台规定的程序和要求使用西邮树洞App平台向会员提供的各项网络服务，如果会员对该服务有异议，可以与西邮树洞App平台联系以便得到及时解决。\n\n" +
                "5.3 用户在申请使用西邮树洞App平台网络服务时，必须向西邮树洞App平台提供准确的个人资料，如个人资料有任何变动，必须及时更新。\n\n" +
                "5.4 用户须同意接受西邮树洞App平台通过电子邮件或其他方式向会员发送相关商业信息。\n\n" +
                "5.5 用户在使用西邮树洞App平台服务时，必须遵守中华人民共和国相关法律法规的规定，不得利用本服务进行任何违法或不正当的活动，包括但不限于下列行为∶\n\n" +
                "5.5.1 制作、复制、发布、传播或以其它方式传送含有下列内容之一的信息：\n" +
                "•反对宪法所确定的基本原则的\n" +
                "•危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；\n" +
                "•损害国家荣誉和利益的；\n" +
                "•煽动民族仇恨、民族歧视、破坏民族团结的；\n" +
                "•破坏国家宗教政策，宣扬邪教和封建迷信的；\n" +
                "•散布谣言，扰乱社会秩序，破坏社会稳定的；\n" +
                "•散布淫秽、色情、赌博、暴力、凶杀、恐怖或者教唆犯罪的；\n" +
                "•侮辱或者诽谤他人，侵害他人合法权利的；\n" +
                "•煽动非法集会、结社、游行、示威、聚众扰乱社会秩序的；\n" +
                "•以非法民间组织名义活动的；\n" +
                "•含有虚假、有害、胁迫、侵害他人隐私、骚扰、侵害、中伤、粗俗、猥亵、或其它道德上令人反感的内容；\n" +
                "•含有中国法律、法规、规章、条例以及任何具有法律效力之规范所限制或禁止的其它内容的。\n\n" +
                "5.5.2 不得利用西邮树洞App服务从事以下活动：\n" +
                "•未经允许，进入计算机信息网络或者使用计算机信息网络资源；\n" +
                "•未经允许，对计算机信息网络功能进行删除、修改或者增加；\n" +
                "•未经允许，对进入计算机信息网络中存储、处理或者传输的数据和应用程序进行删除、修改或者增加；\n" +
                "•故意制作、传播计算机病毒等破坏性程序；\n" +
                "•其他危害计算机信息网络安全的行为。\n\n" +
                "5.6 用户违反本协议或相关的服务条款的规定，导致或产生的任何第三方主张的任何索赔、要求或损失，包括合理的律师费，您同意赔偿西邮树洞App平台与合作公司、关联公司，并使之免受损害。对此，西邮树洞App平台有权视用户的行为性质，采取包括但不限于删除用户发布信息内容、暂停使用许可、终止服务、限制使用、回收西邮树洞App平台帐号、追究法律责任等措施。对恶意注册西邮树洞App平台帐号或利用西邮树洞App平台帐号进行违法活动、捣乱、骚扰、欺骗、其他用户以及其他违反本协议的行为，西邮树洞App平台有权回收其帐号。同时，本公司会视司法部门的要求，协助调查。\n\n" +
                "5.7 用户不得对西邮树洞App平台任何部分通过任何方式进行复制、拷贝、出售、转售或用于任何其它商业目的。\n\n" +
                "5.8 用户须对自己在使用西邮树洞App平台服务过程中的行为承担法律责任。用户承担法律责任的形式包括但不限于：对受到侵害者进行赔偿，以及在西邮树洞App平台运营公司首先承担了因用户行为导致的行政处罚或侵权损害赔偿责任后，用户应给予西邮树洞App平台运营公司等额的赔偿。");
        TitleAndContent t8 = new TitleAndContent("第六章 其他", "6.1 因不可抗力或者其他意外事件，使得本协议的履行不可能、不必要或者无意义的，双方均不承担责任。本协议所称之不可抗力意指不能预见、不能避免并不能克服的客观情况，包括但不限于战争、台风、水灾、火灾、雷击或地震、罢工、暴动、法定疾病、黑客攻击、网络病毒、电信部门技术管制、政府行为或任何其它自然或人为造成的灾难等客观情况。\n\n" +
                "6.2 本条款及其修订本的有效性、履行和与本条款及其修订本效力有关的所有事宜，将受中华人民共和国法律约束，任何争议仅适用中华人民共和国法律。\n\n" +
                "6.3 因本条款所引起的用户与本公司的任何纠纷或争议，首先应友好协商解决，协商不成的，用户在此同意将纠纷或争议提交本公司住所地有管辖权的人民法院诉讼解决。\n\n" +
                "6.4用户正确提交注册程序所需的资料并确认本协议后，本协议在西邮树洞App平台与用户之间成立并生效。\n\n" +
                "6.5本协议生效前的注册用户只需要使用原用户名及密码登录西邮树洞App平台网站重新接受并确认本协议，即可继续使用西邮树洞App平台的服务。\n\n" +
                "6.6协议有效期：从用户同意本协议或使用西邮树洞App平台起至用户注销西邮树洞App平台服务止。\n\n" +
                "6.7本协议如无特殊规定，双方应当使用电子邮件方式就本协议相关事项进行联系。\n\n" +
                "6.8西邮树洞App平台各相关部门的电子邮箱以在西邮树洞App平台官方网站上注明的为准。\n\n" +
                "6.9使用西邮树洞App平台即表示接受西邮树洞App平台服务协议及其所有附件。\n\n" +
                "6.10本协议的最终解释权归西邮树洞App平台所有。");
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);
        list.add(t6);
        list.add(t7);
        list.add(t8);
    }

    private void initView() {
        listView = (ListViewInScrollView) findViewById(R.id.helpTextID);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("用户协议");
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home: {
                finish();
                break;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
