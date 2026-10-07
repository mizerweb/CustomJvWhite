package defpackage;

import android.widget.EditText;
import one.me.chats.tab.ChatsTabWidget;

/* JADX INFO: loaded from: classes.dex */
public final class kl3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kl3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ek4 ek4Var = (ek4) obj;
                ((rl3) obj2).N1.l(ek4Var.a, ek4Var.l);
                return sbiVar;
            case 1:
                return p90.a((rt2) obj2);
            case 2:
                return Boolean.valueOf(!((ChatsTabWidget) obj2).I);
            case 3:
                if (((Throwable) obj) != null) {
                    ((t25) obj2).close();
                }
                return sbiVar;
            case 4:
                r5c r5cVar = (r5c) obj2;
                if (((Boolean) obj).booleanValue()) {
                    EditText editText = r5cVar.i;
                    editText.requestFocus();
                    editText.post(new o90(r5cVar, 20, editText));
                    r5cVar.setOnWindowFocusChanged(null);
                }
                return sbiVar;
            case 5:
                ((u72) obj2).cancel(false);
                return sbiVar;
            default:
                ((ek2) obj2).resumeWith(sbiVar);
                return sbiVar;
        }
    }
}
