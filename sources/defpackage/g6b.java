package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g6b extends ha implements af7 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6b(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.h = i3;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.h;
        sbi sbiVar = sbi.a;
        Object obj = this.a;
        switch (i) {
            case 0:
                mjg mjgVar = ((p5b) obj).a;
                o5b o5bVar = new o5b((LinkedHashSet) null, true, 3);
                mjgVar.getClass();
                mjgVar.j(null, o5bVar);
                break;
            case 1:
                ((q7d) obj).a(null);
                break;
            default:
                ((ich) obj).d();
                break;
        }
        return sbiVar;
    }
}
