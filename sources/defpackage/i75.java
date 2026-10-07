package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i75 implements r89, t00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ i75(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.t00
    public e89 apply(Object obj) {
        return rx8.J(new j2a(this.a, this.b, (List) obj));
    }

    @Override // defpackage.r89
    public void invoke(Object obj) {
        ((xf) obj).i(this.a, this.b);
    }

    public /* synthetic */ i75(int i, long j, wf wfVar) {
        this.b = j;
        this.a = i;
    }
}
