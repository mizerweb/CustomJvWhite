package one.me.sdk.database;

import android.os.Looper;
import androidx.work.impl.model.WorkersQueueDao_Impl;
import defpackage.aae;
import defpackage.af7;
import defpackage.an6;
import defpackage.ba2;
import defpackage.bre;
import defpackage.dm6;
import defpackage.dn4;
import defpackage.en;
import defpackage.evi;
import defpackage.f0j;
import defpackage.f6;
import defpackage.fpb;
import defpackage.g24;
import defpackage.gh3;
import defpackage.gmd;
import defpackage.gn6;
import defpackage.icg;
import defpackage.ifh;
import defpackage.j7e;
import defpackage.jg0;
import defpackage.kic;
import defpackage.kkg;
import defpackage.kki;
import defpackage.l54;
import defpackage.n35;
import defpackage.nka;
import defpackage.nuc;
import defpackage.p0f;
import defpackage.pmg;
import defpackage.pnb;
import defpackage.ql;
import defpackage.qwg;
import defpackage.rre;
import defpackage.sxa;
import defpackage.sxl;
import defpackage.tnb;
import defpackage.wd8;
import defpackage.wna;
import defpackage.wxb;
import defpackage.xdj;
import defpackage.xj1;
import defpackage.xkh;
import defpackage.yea;
import defpackage.ymg;
import defpackage.ys9;
import defpackage.yzg;
import defpackage.zn6;
import kotlin.Metadata;
import one.me.sdk.database.OneMeRoomDatabase;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/sdk/database/OneMeRoomDatabase;", "Lrre;", "<init>", "()V", "database"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class OneMeRoomDatabase extends rre {
    public static volatile f6 o;
    public final ifh l;
    public final Looper m = Looper.getMainLooper();
    public final ifh n;

    public OneMeRoomDatabase() {
        final int i = 0;
        this.l = new ifh(new af7(this) { // from class: u6c
            public final /* synthetic */ OneMeRoomDatabase b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                OneMeRoomDatabase oneMeRoomDatabase = this.b;
                switch (i2) {
                    case 0:
                        return new WorkersQueueDao_Impl(oneMeRoomDatabase);
                    default:
                        pic picVarE = oneMeRoomDatabase.e();
                        return new j48((String) picVarE.b, (String) picVarE.c);
                }
            }
        });
        final int i2 = 1;
        this.n = new ifh(new af7(this) { // from class: u6c
            public final /* synthetic */ OneMeRoomDatabase b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                OneMeRoomDatabase oneMeRoomDatabase = this.b;
                switch (i3) {
                    case 0:
                        return new WorkersQueueDao_Impl(oneMeRoomDatabase);
                    default:
                        pic picVarE = oneMeRoomDatabase.e();
                        return new j48((String) picVarE.b, (String) picVarE.c);
                }
            }
        });
    }

    public abstract n35 A();

    public abstract dm6 B();

    public abstract an6 C();

    public abstract gn6 D();

    public abstract zn6 E();

    public abstract wd8 F();

    public abstract ys9 G();

    public abstract yea H();

    public abstract nka I();

    public abstract wna J();

    public abstract sxa K();

    public abstract pnb L();

    public abstract tnb M();

    public abstract fpb N();

    public abstract kic O();

    public abstract nuc P();

    public abstract gmd Q();

    public abstract j7e R();

    public abstract aae S();

    public abstract bre T();

    public abstract p0f U();

    public abstract icg V();

    public abstract kkg W();

    public abstract pmg X();

    public abstract ymg Y();

    public abstract qwg Z();

    @Override // defpackage.rre
    public final void a() {
        f6 f6Var = o;
        if (f6Var != null && this.m.isCurrentThread()) {
            f6Var.a.d().c().a("ONEME-8045", new NotMainThreadException(k(), sxl.d(Thread.currentThread())));
            wxb wxbVar = wxb.a;
        }
    }

    public abstract yzg a0();

    public abstract xkh b0();

    public abstract kki c0();

    public abstract evi d0();

    public abstract f0j e0();

    public abstract xdj f0();

    public abstract ql r();

    public abstract en s();

    public abstract jg0 t();

    public abstract xj1 u();

    public abstract ba2 v();

    public abstract gh3 w();

    public abstract g24 x();

    public abstract l54 y();

    public abstract dn4 z();
}
