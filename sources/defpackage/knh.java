package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class knh {
    public final Context a;
    public final Context b;
    public final o1c c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public knh(Context context, xhh xhhVar, Context context2, o1c o1cVar) {
        this.a = context;
        this.b = context2;
        this.c = o1cVar;
        e9i.j0(new fz6(new r07((r8e) pq3.j.e(context2).h, e9i.K(o1cVar.a, 1), new jnh(3, null), 0), new hpf(this, null, 10), 3), cqk.a(((n0c) xhhVar).a()));
    }

    public final TextPaint a(noh nohVar) {
        return (TextPaint) this.d.computeIfAbsent(nohVar, new am(23, new bad(nohVar, 21, this)));
    }
}
