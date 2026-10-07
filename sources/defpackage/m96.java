package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m96 {
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public List f;
    public String g;
    public Long h;
    public String i;
    public int j;
    public String k;
    public Integer l;
    public String m;
    public String n;
    public String o;
    public Locale p;
    public long q;
    public String r;

    public final n96 a() {
        Objects.requireNonNull(this.a, "conversation id must not be null");
        Objects.requireNonNull(this.e, "endpointBaseUrl must not be null");
        Objects.requireNonNull(this.g, "appVersion must not be null");
        Objects.requireNonNull(this.i, "clientType must not be null");
        Objects.requireNonNull(this.k, "capabilities must not be null");
        String str = this.a;
        str.getClass();
        String str2 = this.b;
        String str3 = this.c;
        int i = this.d;
        String str4 = this.e;
        str4.getClass();
        List list = this.f;
        String str5 = this.g;
        str5.getClass();
        Long l = this.h;
        String str6 = this.i;
        str6.getClass();
        int i2 = this.j;
        String str7 = this.k;
        str7.getClass();
        return new n96(str, str2, str3, i, str4, list, str5, l, str6, i2, str7, this.l, this.m, this.n, this.o, this.p, this.r, this.q);
    }
}
