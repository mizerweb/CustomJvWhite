package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class kwa {
    public static final HashMap c = new HashMap();
    public final String a;
    public final sr3 b;

    public kwa(String str, sr3 sr3Var) {
        this.a = str;
        this.b = sr3Var;
    }

    public final String toString() {
        return x05.i(new StringBuilder("Metadata.Key("), this.a, ')');
    }
}
