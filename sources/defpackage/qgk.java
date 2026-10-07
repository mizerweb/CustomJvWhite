package defpackage;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.http.HttpClient;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qgk {
    public static final Logger a;
    public static final ifh b;
    public static final ifh c;
    public static final ifh d;
    public static final ifh e;
    public static final ifh f;
    public static final ifh g;
    public static final ifh h;
    public static final ifh i;
    public static final ifh j;
    public static final ifh k;
    public static final ifh l;
    public static final ifh m;
    public static final ifh n;
    public static final ifh o;
    public static final ifh p;
    public static final ifh q;
    public static final ifh r;
    public static final ifh s;
    public static final ifh t;
    public static final ifh u;
    public static final ifh v;

    static {
        gik gikVar = dul.o;
        a = gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk");
        b = new ifh(pgk.e);
        c = new ifh(pgk.q);
        d = new ifh(pgk.u);
        e = new ifh(gg5.E);
        new ifh(pgk.s);
        f = new ifh(pgk.f);
        g = new ifh(pgk.o);
        h = new ifh(pgk.p);
        i = new ifh(gg5.D);
        j = new ifh(pgk.n);
        k = new ifh(pgk.d);
        l = new ifh(pgk.r);
        m = new ifh(pgk.h);
        n = new ifh(pgk.b);
        o = new ifh(pgk.t);
        p = new ifh(gg5.C);
        new ifh(pgk.i);
        q = new ifh(pgk.c);
        r = new ifh(pgk.l);
        s = new ifh(pgk.m);
        t = new ifh(pgk.k);
        u = new ifh(pgk.g);
        v = new ifh(pgk.j);
    }

    public static final yki a() {
        if (dul.o != null) {
            gik gikVar = dul.o;
            return new yki(gikVar != null ? gikVar.c : new DefaultLogger("VkpnsClientSdk"));
        }
        ore.k("ConfigModule.init() must be called before accessing its members");
        return null;
    }

    public static AnalyticsSender b() {
        if (dul.o != null) {
            return (d4k) p.getValue();
        }
        ore.k("ConfigModule.init() must be called before accessing its members");
        return null;
    }

    public static xde c() {
        if (dul.o == null) {
            ore.k("ConfigModule.init() must be called before accessing its members");
            return null;
        }
        HttpClient httpClient = (HttpClient) fgk.b.getValue();
        gik gikVar = dul.o;
        if (gikVar == null) {
            ore.k("ConfigModule.init() must be called before accessing its members");
            return null;
        }
        String str = gikVar.b;
        gik gikVar2 = dul.o;
        if (gikVar2 == null) {
            ore.k("ConfigModule.init() must be called before accessing its members");
            return null;
        }
        Object pusherHostProvider = gikVar2.d;
        if (pusherHostProvider == null) {
            pusherHostProvider = new PusherHostProvider();
        }
        return new xde(new r6a(httpClient, str, pusherHostProvider), (g7k) c.getValue(), a);
    }
}
