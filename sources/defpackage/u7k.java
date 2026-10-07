package defpackage;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class u7k implements n4g {
    public final /* synthetic */ q4g a;
    public final /* synthetic */ f4g b;
    public final /* synthetic */ q4g c;

    public u7k(q4g q4gVar, f4g f4gVar) {
        this.c = q4gVar;
        this.b = f4gVar;
        this.a = q4gVar;
    }

    @Override // defpackage.n4g
    public final void onResponse(JSONObject jSONObject) {
        this.c.c.removeCallbacks(this.b);
        this.a.g();
    }
}
