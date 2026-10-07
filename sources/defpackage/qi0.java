package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class qi0 implements AutoCloseable {
    public final xva a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final AtomicBoolean f;
    public final v30 g;
    public final xr6 h;
    public final Executor i;
    public final ug4 j;
    public final boolean k;
    public final boolean l;
    public final long m;

    public qi0(xr6 xr6Var, Executor executor, ug4 ug4Var, boolean z, boolean z2, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new xva(9, new tt3()) : new xva(9, new dul(20));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference(null);
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(new qk5(5));
        this.f = new AtomicBoolean(false);
        this.g = new v30(Boolean.FALSE);
        this.h = xr6Var;
        this.i = executor;
        this.j = ug4Var;
        this.k = z;
        this.l = z2;
        this.m = j;
    }

    public final void A(v3j v3jVar, boolean z) {
        int i;
        String strK;
        xr6 xr6Var = v3jVar.a;
        xr6 xr6Var2 = this.h;
        if (!Objects.equals(xr6Var, xr6Var2)) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + xr6Var + ", Expected: " + xr6Var2 + "]");
        }
        if (z) {
            String strConcat = "Sending VideoRecordEvent ".concat(v3jVar.getClass().getSimpleName());
            if ((v3jVar instanceof q3j) && (i = ((q3j) v3jVar).d) != 0) {
                switch (i) {
                    case 0:
                        strK = "ERROR_NONE";
                        break;
                    case 1:
                        strK = "ERROR_UNKNOWN";
                        break;
                    case 2:
                        strK = "ERROR_FILE_SIZE_LIMIT_REACHED";
                        break;
                    case 3:
                        strK = "ERROR_INSUFFICIENT_STORAGE";
                        break;
                    case 4:
                        strK = "ERROR_SOURCE_INACTIVE";
                        break;
                    case 5:
                        strK = "ERROR_INVALID_OUTPUT_OPTIONS";
                        break;
                    case 6:
                        strK = "ERROR_ENCODING_FAILED";
                        break;
                    case 7:
                        strK = "ERROR_RECORDER_ERROR";
                        break;
                    case 8:
                        strK = "ERROR_NO_VALID_DATA";
                        break;
                    case 9:
                        strK = "ERROR_DURATION_LIMIT_REACHED";
                        break;
                    case 10:
                        strK = "ERROR_RECORDING_GARBAGE_COLLECTED";
                        break;
                    default:
                        strK = c0a.k(i, "Unknown(", ")");
                        break;
                }
                strConcat = strConcat.concat(" [error: " + strK + "]");
            }
            tvj.a("Recorder", strConcat);
        }
        boolean z2 = v3jVar instanceof t3j;
        v30 v30Var = this.g;
        if (z2 || (v3jVar instanceof s3j)) {
            v30Var.D(Boolean.TRUE);
        } else if ((v3jVar instanceof r3j) || (v3jVar instanceof q3j)) {
            v30Var.D(Boolean.FALSE);
        }
        Executor executor = this.i;
        if (executor == null || this.j == null) {
            return;
        }
        try {
            executor.execute(new yde(this, 0, v3jVar));
        } catch (RejectedExecutionException e) {
            tvj.d("Recorder", "The callback executor is invalid.", e);
        }
    }

    public final void b(Uri uri) {
        if (this.b.get()) {
            g((ug4) this.e.getAndSet(null), uri);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b(Uri.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qi0)) {
            return false;
        }
        qi0 qi0Var = (qi0) obj;
        if (!this.h.equals(qi0Var.h)) {
            return false;
        }
        Executor executor = qi0Var.i;
        Executor executor2 = this.i;
        if (executor2 == null) {
            if (executor != null) {
                return false;
            }
        } else if (!executor2.equals(executor)) {
            return false;
        }
        ug4 ug4Var = qi0Var.j;
        ug4 ug4Var2 = this.j;
        if (ug4Var2 == null) {
            if (ug4Var != null) {
                return false;
            }
        } else if (!ug4Var2.equals(ug4Var)) {
            return false;
        }
        return this.k == qi0Var.k && this.l == qi0Var.l && this.m == qi0Var.m;
    }

    public final void finalize() throws Throwable {
        try {
            ((ut3) this.a.b).q();
            ug4 ug4Var = (ug4) this.e.getAndSet(null);
            if (ug4Var != null) {
                g(ug4Var, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final void g(ug4 ug4Var, Uri uri) {
        if (ug4Var != null) {
            ((ut3) this.a.b).close();
            ug4Var.accept(uri);
        } else {
            throw new AssertionError("Recording " + this + " has already been finalized");
        }
    }

    public final int hashCode() {
        int iHashCode = (this.h.b.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.i;
        int iHashCode2 = (iHashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        ug4 ug4Var = this.j;
        int iHashCode3 = (((iHashCode2 ^ (ug4Var != null ? ug4Var.hashCode() : 0)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        int i = this.l ? 1231 : 1237;
        long j = this.m;
        return ((int) ((j >>> 32) ^ j)) ^ ((iHashCode3 ^ i) * 1000003);
    }

    public final void l(Context context, vde vdeVar) {
        if (this.b.getAndSet(true)) {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
        ((ut3) this.a.b).a("finalizeRecording");
        this.c.set(new zde(this, vdeVar, this.h));
        if (this.k) {
            if (Build.VERSION.SDK_INT < 31) {
                context = null;
            }
            this.d.set(new aee(context));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.h);
        sb.append(", getCallbackExecutor=");
        sb.append(this.i);
        sb.append(", getEventListener=");
        sb.append(this.j);
        sb.append(", hasAudioEnabled=");
        sb.append(this.k);
        sb.append(", isPersistent=");
        sb.append(this.l);
        sb.append(", getRecordingId=");
        return c0a.m(this.m, "}", sb);
    }

    public final r9b y(int i, mx1 mx1Var) throws IOException {
        if (!this.b.get()) {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
        zde zdeVar = (zde) this.c.getAndSet(null);
        if (zdeVar == null) {
            ahc.f(this, "One-time muxer creation has already occurred for recording ");
            return null;
        }
        try {
            return zdeVar.a(i, mx1Var);
        } catch (RuntimeException e) {
            throw new IOException("Failed to create Muxer by " + e, e);
        }
    }
}
