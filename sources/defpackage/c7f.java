package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.login.b;
import ru.ok.tamtam.messages.a;

/* JADX INFO: loaded from: classes.dex */
public final class c7f extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ c7f(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        switch (this.b) {
            case 0:
                return new gz3(h5Var.d(26), h5Var.d(228), h5Var.d(85), h5Var.d(114), h5Var.d(526), (ite) h5Var.c(90));
            case 1:
                return new hfa(h5Var.d(116), h5Var.d(136), h5Var.d(85));
            case 2:
                return new ffa(h5Var.d(26), h5Var.d(136), h5Var.d(85), h5Var.d(114), (ite) h5Var.c(90), h5Var.d(593), h5Var.d(144), h5Var.d(54));
            case 3:
                return new jfa(h5Var.d(594), h5Var.d(54), h5Var.d(26), (wmi) h5Var.c(139));
            case 4:
                return new i13((ite) h5Var.c(90), h5Var.d(114), h5Var.d(144), h5Var.d(169), h5Var.d(300));
            case 5:
                return new v8d(h5Var.d(114), h5Var.d(144), h5Var.d(136), h5Var.d(116), h5Var.d(54), (ite) h5Var.c(90));
            case 6:
                ifh ifhVar = new ifh(new ic1(h5Var, 24));
                ifh ifhVarD = h5Var.d(154);
                ifh ifhVarD2 = h5Var.d(462);
                ifh ifhVarD3 = h5Var.d(539);
                ifh ifhVarD4 = h5Var.d(468);
                ifh ifhVarD5 = h5Var.d(666);
                ifh ifhVarD6 = h5Var.d(667);
                ifh ifhVarD7 = h5Var.d(13);
                ifh ifhVar2 = new ifh(d5d.j);
                b5d b5dVar = ((e5d) h5Var.c(26)).H3;
                zv8[] zv8VarArr = e5d.S6;
                return new mih(new cgb(ifhVarD, ifhVarD2, ifhVarD3, ifhVar, ifhVarD4, ifhVarD5, ifhVarD6, ifhVarD7, ifhVar2, ((Boolean) b5dVar.a(zv8VarArr[243]).i()).booleanValue()), h5Var.d(101), h5Var.d(100), h5Var.d(69), h5Var.d(75), h5Var.d(463), (onf) h5Var.c(325), (rg9) h5Var.c(15), ((Boolean) ((e5d) h5Var.c(26)).Y5.a(zv8VarArr[364]).i()).booleanValue());
            case 7:
                return new ygf((gu4) h5Var.c(139), h5Var.d(320), h5Var.d(324), h5Var.d(325), h5Var.d(525), h5Var.d(136), h5Var.d(144));
            case 8:
                return new uj2(h5Var.d(324), h5Var.d(325), h5Var.d(525), h5Var.d(136), h5Var.d(144));
            case 9:
                return new un4((gu4) h5Var.c(139), h5Var.d(132), h5Var.d(134), h5Var.d(619), h5Var.d(286));
            case 10:
                return new i92((pvb) h5Var.c(146), (qfa) h5Var.c(221), (qw2) h5Var.c(131), ((n0c) ((xhh) h5Var.c(23))).c(), (rs6) h5Var.c(138), (t51) h5Var.c(116), (zed) h5Var.c(101), (a2c) h5Var.c(27), (gb9) h5Var.c(610), (a) h5Var.c(486));
            case 11:
                return new kfb((pvb) h5Var.c(146), (xj1) h5Var.c(HttpStatus.SC_EXPECTATION_FAILED), ((zed) h5Var.c(101)).a, (e5d) h5Var.c(26), (xhh) h5Var.c(23), (ite) h5Var.c(90), (qk7) h5Var.c(620), (eh9) h5Var.c(342), (wzj) h5Var.c(290));
            case 12:
                return new nl1((kfb) h5Var.c(602), (e5d) h5Var.c(26), ((zed) h5Var.c(101)).a, (svb) h5Var.c(100), (ite) h5Var.c(90), (cg9) h5Var.c(619), (eh9) h5Var.c(342));
            case 13:
                return new z7a((gjf) h5Var.c(97));
            case 14:
                return new klg(h5Var.d(146), h5Var.d(355), h5Var.d(325));
            case 15:
                return new pcd(h5Var.d(16), h5Var.d(0), h5Var.d(54));
            case 16:
                return new ns7(h5Var.d(16));
            case 17:
                a2c a2cVar = (a2c) h5Var.c(27);
                return new lih(a2cVar.i(a2cVar.b().a(new od6("tam-srvc", 3, 3, 60000L, true, false, 5, true, true, 32)), "tam-srvc"));
            case 18:
                return new hfd(h5Var.d(161), h5Var.d(318));
            case 19:
                return new pfd(h5Var.d(318), h5Var.d(443), h5Var.d(138), h5Var.d(85));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new gb9(h5Var.d(221), h5Var.d(486));
            case 21:
                return sll.a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 22:
                return pwe.a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 23:
                return new ky8((xhh) h5Var.c(23), (ed6) h5Var.c(205), new ic1(h5Var, 25));
            case 24:
                return b.a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 25:
                eh9 eh9Var = new eh9();
                eh9Var.a = new AtomicReference(vd7.a());
                return eh9Var;
            case 26:
                return ru.ok.tamtam.chats.a.a((t51) h5Var.c(116), (xhh) h5Var.c(23));
            case 27:
                return new hk7(h5Var.d(132), h5Var.d(227), h5Var.d(23));
            case 28:
                a2c a2cVar2 = (a2c) h5Var.c(27);
                zv8[] zv8VarArr2 = a2c.t;
                v1c v1cVarB = a2cVar2.b();
                v1cVarB.getClass();
                return new mle(a2cVar2.i(v1cVarB.a(new od6("srvc-rqst", 1, 1, 0L, true, false, 5, true, true)), "srvc-rqst"));
            default:
                return new i50((xhh) h5Var.c(23));
        }
    }
}
