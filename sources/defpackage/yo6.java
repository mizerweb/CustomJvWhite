package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class yo6 implements vi1 {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();

    @Override // defpackage.vi1
    public final void onFeedback(ui1 ui1Var) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((vi1) it.next()).onFeedback(ui1Var);
        }
    }
}
