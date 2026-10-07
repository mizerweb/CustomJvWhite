package ru.ok.tracer.heap.dumps.exceptions;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.a8g;
import defpackage.egl;
import defpackage.g08;
import defpackage.i89;
import defpackage.k89;
import defpackage.l89;
import defpackage.nhb;
import defpackage.np4;
import defpackage.ou7;
import defpackage.rx8;
import defpackage.ste;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/tracer/heap/dumps/exceptions/ShrinkDumpWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "gql", "tracer-heap-dumps_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShrinkDumpWorker extends Worker {
    public ShrinkDumpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public final l89 d() {
        Context context = this.a;
        WorkerParameters workerParameters = this.b;
        String strD = workerParameters.b.d("param_dump_path");
        if (strD == null || strD.length() == 0) {
            return new i89();
        }
        String strD2 = workerParameters.b.d("param_tag");
        File file = new File(strD);
        long length = file.length();
        if (length < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            file.delete();
            return new k89();
        }
        ste steVar = np4.b;
        if (a8g.n(steVar)) {
            file.delete();
            return new k89();
        }
        try {
            File fileJ = nhb.j(context, steVar);
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                int i = g08.l;
                g08 g08Var = new g08(new DataInputStream(new BufferedInputStream(bufferedInputStream)));
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileJ));
                    try {
                        egl.a(g08Var, bufferedOutputStream);
                        bufferedOutputStream.close();
                        g08Var.close();
                        file.delete();
                        ou7.g(context, steVar, fileJ, strD2, Long.valueOf(length), null, HttpStatus.SC_REQUEST_TIMEOUT);
                        return new k89();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(bufferedOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        rx8.n(g08Var, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                file.delete();
                throw th5;
            }
        } catch (IOException unused) {
            return new i89();
        }
    }
}
