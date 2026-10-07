package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class kz4 extends fie {
    private final nie g;

    public static class a {
        private final nie a;

        public a(nie nieVar) {
            yab.s(nieVar);
            this.a = nieVar;
        }

        public kz4 a() {
            return new kz4(this.a, null);
        }
    }

    public /* synthetic */ kz4(nie nieVar, lmk lmkVar) {
        super(TextUtils.isEmpty(nieVar.a()) ? "no_model_name" : nieVar.a(), null, u0b.CUSTOM);
        this.g = nieVar;
    }

    public nie i() {
        return this.g;
    }
}
