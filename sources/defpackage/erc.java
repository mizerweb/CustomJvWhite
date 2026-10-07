package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class erc {
    public final boolean a;
    public final boolean b;
    public final f83 c;
    public final bsc d;
    public final u8b e;
    public final gu4 f;
    public final u8b g;
    public final yc6 h;
    public final exb i;
    public final rrc j;
    public final ftc k;
    public final ifh l;
    public final ifh m;

    public erc(boolean z, boolean z2, f83 f83Var, bsc bscVar, u8b u8bVar, gu4 gu4Var, u8b u8bVar2, yc6 yc6Var, exb exbVar, rrc rrcVar, ftc ftcVar) {
        this.a = z;
        this.b = z2;
        this.c = f83Var;
        this.d = bscVar;
        this.e = u8bVar;
        this.f = gu4Var;
        this.g = u8bVar2;
        this.h = yc6Var;
        this.i = exbVar;
        this.j = rrcVar;
        this.k = ftcVar;
        final int i = 0;
        this.l = new ifh(new af7(this) { // from class: crc
            public final /* synthetic */ erc b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                erc ercVar = this.b;
                switch (i2) {
                    case 0:
                        u8b u8bVar3 = ercVar.g;
                        ArrayList arrayList = new ArrayList(u8bVar3.b);
                        Object[] objArr = u8bVar3.a;
                        int i3 = u8bVar3.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            arrayList.add((hc6) ((cf7) objArr[i4]).invoke(ercVar));
                        }
                        return Collections.unmodifiableList(arrayList);
                    default:
                        return a.Y0(new yc6[]{new i44(), ercVar.h});
                }
            }
        });
        final int i2 = 1;
        this.m = new ifh(new af7(this) { // from class: crc
            public final /* synthetic */ erc b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                erc ercVar = this.b;
                switch (i3) {
                    case 0:
                        u8b u8bVar3 = ercVar.g;
                        ArrayList arrayList = new ArrayList(u8bVar3.b);
                        Object[] objArr = u8bVar3.a;
                        int i4 = u8bVar3.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            arrayList.add((hc6) ((cf7) objArr[i5]).invoke(ercVar));
                        }
                        return Collections.unmodifiableList(arrayList);
                    default:
                        return a.Y0(new yc6[]{new i44(), ercVar.h});
                }
            }
        });
    }

    public final long a() {
        if (this.b) {
            return System.currentTimeMillis();
        }
        if (this.i != null) {
            ghb ghbVar = ew5.b;
            return ew5.g(qe7.P(SystemClock.elapsedRealtime(), lw5.MILLISECONDS));
        }
        ore.p("Required value was null.");
        return 0L;
    }

    public final ftc b() {
        ftc ftcVar = this.k;
        if (ftcVar != null) {
            return ftcVar;
        }
        ore.p("Required value was null.");
        return null;
    }

    public final rrc c() {
        rrc rrcVar = this.j;
        if (rrcVar != null) {
            return rrcVar;
        }
        ore.p("Required value was null.");
        return null;
    }

    public final gu4 d() {
        gu4 gu4Var = this.f;
        krc krcVar = gu4Var != null ? new krc(gu4Var) : null;
        if (krcVar != null) {
            return krcVar.a;
        }
        ore.p("Required value was null.");
        return null;
    }
}
