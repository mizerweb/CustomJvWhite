package defpackage;

import android.os.Handler;
import android.system.ErrnoException;
import android.system.Os;
import android.util.SparseBooleanArray;
import androidx.media3.muxer.MuxerException;
import java.io.FileDescriptor;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class lh6 implements jg7 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public lh6(String str) {
        this.a = 1;
        this.d = null;
        this.e = new s2b(new yr6(new FileOutputStream(str)));
    }

    @Override // defpackage.jg7
    public void a(Object obj) {
        final j2a j2aVar = (j2a) obj;
        d3a d3aVar = ((o3a) this.e).g;
        Handler handler = d3aVar.l;
        final i2a i2aVar = (i2a) this.d;
        final boolean z = this.b;
        final boolean z2 = this.c;
        vqi.d0(handler, new su6(d3aVar, i2aVar, new Runnable() { // from class: i3a
            @Override // java.lang.Runnable
            public final void run() {
                d3a d3aVar2 = ((o3a) this.a.e).g;
                j4d j4dVar = d3aVar2.t;
                gm0.M(j4dVar, j2aVar);
                int playbackState = j4dVar.getPlaybackState();
                if (z) {
                    if (playbackState == 1) {
                        if (j4dVar.c(2)) {
                            j4dVar.prepare();
                        }
                    } else if (playbackState == 4 && j4dVar.c(4)) {
                        j4dVar.j();
                    }
                }
                boolean z3 = z2;
                if (z3 && j4dVar.c(1)) {
                    j4dVar.play();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i : new int[]{31, 2}) {
                    lvb.b0(!false);
                    sparseBooleanArray.append(i, true);
                }
                if (z3) {
                    lvb.b0(!false);
                    sparseBooleanArray.append(1, true);
                }
                lvb.b0(!false);
                d3aVar2.q(i2aVar);
            }
        }));
    }

    public void b() {
        this.d = null;
        this.c = false;
        this.e = null;
        this.b = false;
    }

    public void c() {
        try {
            try {
                ((s2b) this.e).close();
                FileDescriptor fileDescriptor = (FileDescriptor) this.d;
                if (fileDescriptor != null) {
                    Os.close(fileDescriptor);
                }
                this.c = true;
                this.b = false;
            } catch (ErrnoException e) {
                e = e;
                qr7.o(e);
            }
        } catch (ErrnoException | MuxerException e2) {
            e = e2;
            qr7.o(e);
        }
    }

    @Override // defpackage.jg7
    public void onFailure(Throwable th) {
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sbV = qt4.v("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                sbV.append((String) this.d);
                sbV.append(", name=");
                return x05.i(sbV, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public lh6(String str, String str2, boolean z, boolean z2) {
        this.a = 0;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public lh6() {
        this.a = 3;
    }

    public lh6(o3a o3aVar, i2a i2aVar, boolean z, boolean z2) {
        this.a = 2;
        this.e = o3aVar;
        this.d = i2aVar;
        this.b = z;
        this.c = z2;
    }
}
