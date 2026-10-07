package defpackage;

import android.os.Bundle;
import java.util.Set;
import kotlin.collections.a;
import one.me.chatscreen.ChatScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qa3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ qa3(ChatScreen chatScreen, Bundle bundle, int i) {
        this.a = i;
        this.b = chatScreen;
        this.c = bundle;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        xx6 ra1Var;
        int i = this.a;
        Bundle bundle = this.c;
        ChatScreen chatScreen = this.b;
        switch (i) {
            case 0:
                yd3 yd3Var = (yd3) chatScreen.f.getAccessor().c(1053);
                qx2 qx2VarI2 = chatScreen.i2();
                t73 t73VarB = sol.b(chatScreen.d);
                vv vvVar = chatScreen.q;
                zv8[] zv8VarArr = ChatScreen.M1;
                zv8 zv8Var = zv8VarArr[0];
                long jLongValue = ((Number) vvVar.a(chatScreen)).longValue();
                vv vvVar2 = chatScreen.s;
                zv8 zv8Var2 = zv8VarArr[2];
                String str = (String) vvVar2.a(chatScreen);
                ChatScreen.L1.getClass();
                q24 q24Var = (q24) bundle.getParcelable("ARG_COMMENTS_ID");
                boolean z = bundle.getBoolean("is_preview");
                yd3Var.getClass();
                return new xd3(jLongValue, t73VarB, qx2VarI2, str, q24Var, z, yd3Var.a, yd3Var.b, yd3Var.c, yd3Var.d, yd3Var.e, yd3Var.f, yd3Var.g, yd3Var.h, yd3Var.i, yd3Var.j, yd3Var.k, yd3Var.l, yd3Var.m, yd3Var.n, yd3Var.o, yd3Var.p, yd3Var.q, yd3Var.r, yd3Var.s, yd3Var.t, yd3Var.u, yd3Var.v, yd3Var.w, yd3Var.x, yd3Var.y, yd3Var.z, yd3Var.A, yd3Var.B, yd3Var.C, yd3Var.D, yd3Var.E, yd3Var.F, yd3Var.G, yd3Var.H, yd3Var.I, yd3Var.J, yd3Var.K, yd3Var.L, yd3Var.M, yd3Var.N, yd3Var.O, yd3Var.P, yd3Var.Q, yd3Var.R, yd3Var.S, yd3Var.T);
            case 1:
                ou7 ou7Var = ChatScreen.L1;
                vv vvVar3 = chatScreen.u;
                zv8[] zv8VarArr2 = ChatScreen.M1;
                zv8 zv8Var3 = zv8VarArr2[4];
                long[] jArr = (long[]) vvVar3.a(chatScreen);
                h hVar = chatScreen.f;
                Set setO1 = jArr != null ? a.o1(jArr) : null;
                Long lP1 = chatScreen.P1();
                Long lP2 = (lP1 != null && lP1.longValue() == 0) ? null : chatScreen.P1();
                boolean zL2 = chatScreen.l2();
                r8e r8eVar = chatScreen.k2().G1;
                ifh ifhVarD = hVar.getAccessor().d(85);
                ifh ifhVarD2 = hVar.getAccessor().d(54);
                ny8 ny8VarB = hVar.b();
                ifh ifhVarD3 = sol.d(chatScreen.d) ? hVar.getAccessor().d(228) : hVar.getAccessor().d(136);
                ifh ifhVarD4 = hVar.getAccessor().d(132);
                ifh ifhVarD5 = hVar.getAccessor().d(144);
                ny8 ny8VarP = rx8.P(3, new pa3(chatScreen, 10));
                ny8 ny8VarP2 = rx8.P(3, new pa3(chatScreen, 11));
                ifh ifhVarD6 = hVar.getAccessor().d(802);
                ifh ifhVarD7 = hVar.getAccessor().d(803);
                ifh ifhVarD8 = hVar.getAccessor().d(353);
                ifh ifhVarD9 = hVar.getAccessor().d(804);
                ny8 ny8VarP3 = rx8.P(3, new pa3(chatScreen, 12));
                ifh ifhVarD10 = hVar.getAccessor().d(495);
                vv vvVar4 = chatScreen.t;
                zv8 zv8Var4 = zv8VarArr2[3];
                Long l = (Long) vvVar4.a(chatScreen);
                if (l != null) {
                    long jLongValue2 = l.longValue();
                    xd3 xd3VarK2 = chatScreen.k2();
                    bpa bpaVarA = huk.a(cqk.D(xd3VarK2.b, ((n0c) xd3VarK2.H()).a()), xd3VarK2.f, jLongValue2, xd3VarK2.c.a);
                    ra1Var = new ra1(5, new dz6(new xc3(bpaVarA.b(), 0), new zu(bpaVarA, (lq4) null, 5)));
                } else {
                    ra1Var = o66.a;
                }
                ifh ifhVarD11 = hVar.getAccessor().d(18);
                t73 t73Var = chatScreen.k2().c;
                ChatScreen.L1.getClass();
                return new nma(setO1, lP2, zL2, ifhVarD, ifhVarD2, ny8VarB, ifhVarD4, ifhVarD3, ifhVarD5, ny8VarP, ny8VarP2, ifhVarD6, ifhVarD7, ifhVarD8, ifhVarD9, ny8VarP3, ifhVarD10, ifhVarD11, r8eVar, ra1Var, t73Var, (q24) bundle.getParcelable("ARG_COMMENTS_ID"), hVar.getAccessor().d(350));
            default:
                aa3 aa3Var = (aa3) chatScreen.f.getAccessor().c(1056);
                r8e r8eVar2 = chatScreen.k2().G1;
                boolean z2 = bundle.getBoolean("is_preview");
                String string = bundle.getString("source_folder");
                if (string == null) {
                    string = "all.chat.folder";
                }
                return new z93(r8eVar2, z2, string, aa3Var.a, aa3Var.b, aa3Var.c, aa3Var.d, aa3Var.e, aa3Var.f, aa3Var.g, aa3Var.h, aa3Var.i);
        }
    }
}
