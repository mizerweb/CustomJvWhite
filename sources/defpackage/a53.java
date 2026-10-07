package defpackage;

import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a53 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    public /* synthetic */ a53(ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        this.a = i;
        this.b = chatMediaViewerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = false;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = ChatMediaViewerScreen.Z;
                g8c g8cVar = chatMediaViewerScreen.l;
                if (g8cVar != null) {
                    g8cVar.a();
                }
                h8c h8cVar = new h8c(chatMediaViewerScreen);
                h8cVar.m(new tnh(R.string.error_no_browser));
                h8cVar.a(new tnh(R.string.error_no_browser_desc));
                h8cVar.c(new o8c(0, 0, chatMediaViewerScreen.D1(), 11));
                h8cVar.h(new w8c(R.drawable.icon_warning));
                chatMediaViewerScreen.l = h8cVar.p();
                return sbiVar;
            case 1:
                zv8[] zv8VarArr2 = ChatMediaViewerScreen.Z;
                return new sic(chatMediaViewerScreen.getContext(), new ks9(8, chatMediaViewerScreen));
            case 2:
                m63 m63Var = (m63) chatMediaViewerScreen.v.getAccessor().c(946);
                vv vvVar = chatMediaViewerScreen.p;
                zv8[] zv8VarArr3 = ChatMediaViewerScreen.Z;
                zv8 zv8Var = zv8VarArr3[0];
                long jLongValue = ((Number) vvVar.a(chatMediaViewerScreen)).longValue();
                ku6 ku6Var = mg5.d;
                vv vvVar2 = chatMediaViewerScreen.u;
                zv8 zv8Var2 = zv8VarArr3[5];
                mg5 mg5VarQ = ku6.q(ku6Var, Byte.valueOf(((Number) vvVar2.a(chatMediaViewerScreen)).byteValue()));
                vv vvVar3 = chatMediaViewerScreen.q;
                zv8 zv8Var3 = zv8VarArr3[1];
                String str = (String) vvVar3.a(chatMediaViewerScreen);
                vv vvVar4 = chatMediaViewerScreen.r;
                zv8 zv8Var4 = zv8VarArr3[2];
                long jLongValue2 = ((Number) vvVar4.a(chatMediaViewerScreen)).longValue();
                vv vvVar5 = chatMediaViewerScreen.s;
                zv8 zv8Var5 = zv8VarArr3[3];
                boolean zBooleanValue = ((Boolean) vvVar5.a(chatMediaViewerScreen)).booleanValue();
                vv vvVar6 = chatMediaViewerScreen.t;
                zv8 zv8Var6 = zv8VarArr3[4];
                boolean zBooleanValue2 = ((Boolean) vvVar6.a(chatMediaViewerScreen)).booleanValue();
                xu1 xu1Var = (xu1) chatMediaViewerScreen.C.getValue();
                m63Var.getClass();
                return new l63(jLongValue, mg5VarQ, str, jLongValue2, zBooleanValue, zBooleanValue2, xu1Var, m63Var.a, m63Var.b, m63Var.c, m63Var.d, m63Var.e, m63Var.f, m63Var.g, m63Var.h, m63Var.i, m63Var.j, m63Var.k, m63Var.l, m63Var.m, m63Var.n, m63Var.o, m63Var.p, m63Var.q, m63Var.r, m63Var.s, m63Var.t, m63Var.u, m63Var.v);
            case 3:
                return vd7.o(chatMediaViewerScreen.w, new ifh(new a53(chatMediaViewerScreen, 6)), chatMediaViewerScreen);
            case 4:
                zv8[] zv8VarArr4 = ChatMediaViewerScreen.Z;
                if (((Boolean) ((e5d) chatMediaViewerScreen.J.getValue()).P0.a(e5d.S6[92]).i()).booleanValue() && !((Boolean) ((f5d) ((wo6) chatMediaViewerScreen.y.getValue())).w().getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 5:
                zv8[] zv8VarArr5 = ChatMediaViewerScreen.Z;
                l63 l63VarU1 = chatMediaViewerScreen.U1();
                l63VarU1.getClass();
                l63VarU1.K1.B(l63VarU1, l63.O1[5], a8j.t(l63VarU1, null, new e63(1, l63VarU1, null), 1));
                return sbiVar;
            default:
                zv8[] zv8VarArr6 = ChatMediaViewerScreen.Z;
                return chatMediaViewerScreen.getRouter();
        }
    }
}
