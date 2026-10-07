package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eid extends veg {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;

    public eid(int i, long j, long j2) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = j;
                this.c = j2;
                break;
            default:
                this.b = j2;
                this.c = j;
                break;
        }
    }

    public static long d(long j, nmc nmcVar) {
        long jA = nmcVar.A();
        if ((128 & jA) != 0) {
            return 8589934591L & ((((jA & 1) << 32) | nmcVar.C()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.veg
    public final String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.b);
                sb.append(", identifier= ");
                return c0a.m(this.c, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.b);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return c0a.m(this.c, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.b);
                sb3.append(", playbackPositionUs= ");
                return c0a.m(this.c, " }", sb3);
        }
    }

    public eid(long j, long j2, List list) {
        this.a = 1;
        this.b = j;
        this.c = j2;
        Collections.unmodifiableList(list);
    }
}
