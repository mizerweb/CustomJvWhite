package defpackage;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import one.me.sdk.transfer.upload.exceptions.UploadUnhandledException;

/* JADX INFO: loaded from: classes3.dex */
public final class ec2 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec2(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new ec2((CameraDevice) obj2, (sfe) obj, lq4Var, 0);
            case 1:
                return new ec2((zm2) obj2, (wm2) obj, lq4Var, 1);
            case 2:
                return new ec2((zm2) obj2, (j28) obj, lq4Var, 2);
            case 3:
                return new ec2((zt6) obj2, (wo8) obj, lq4Var, 3);
            case 4:
                return new ec2((Path) obj2, (m2c) obj, lq4Var, 4);
            default:
                return new ec2((Path) obj2, (x3c) obj, lq4Var, 5);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws UploadUnhandledException.FileOpenException, IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
            case 4:
                ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((ec2) create(lq4Var)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws UploadUnhandledException.FileOpenException, IOException {
        String message;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                CameraDevice cameraDevice = (CameraDevice) obj3;
                if (cameraDevice != null) {
                    Log.i("CXCP", "Closing Camera " + cameraDevice.getId());
                    String str = "CXCP#CameraDevice-" + cameraDevice.getId() + "#close";
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    try {
                        Trace.beginSection(str);
                        try {
                            cameraDevice.close();
                        } catch (NullPointerException e) {
                            Log.w("CXCP", "NPE encountered during CameraDevice.close()", e);
                        }
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(str, " - ")));
                    } catch (Throwable th) {
                        Log.d("CXCP", p.f(new Object[]{Double.valueOf(p.b(jElapsedRealtimeNanos) / 1000000.0d)}, 1, null, "%.3f ms", zo5.z(str, " - ")));
                        throw th;
                    }
                    break;
                }
                ((sfe) obj2).a = true;
                return sbiVar;
            case 1:
                ch3.d0(obj);
                StringBuilder sb = new StringBuilder();
                zm2 zm2Var = (zm2) obj3;
                sb.append(zm2Var);
                sb.append(" CameraCaptureSessionWrapper#close");
                wm2 wm2Var = (wm2) obj2;
                try {
                    Trace.beginSection(sb.toString());
                    Log.d("CXCP", "Closing capture session for " + zm2Var);
                    bc1.o(wm2Var.a);
                    return sbiVar;
                } finally {
                    Trace.endSection();
                }
            case 2:
                ch3.d0(obj);
                StringBuilder sb2 = new StringBuilder();
                zm2 zm2Var2 = (zm2) obj3;
                sb2.append(zm2Var2);
                sb2.append(" stopRepeating");
                j28 j28Var = (j28) obj2;
                try {
                    Trace.beginSection(sb2.toString());
                    j28Var.B();
                    Trace.endSection();
                    try {
                        Trace.beginSection(zm2Var2 + " abortCaptures");
                        j28Var.h();
                        return sbiVar;
                    } finally {
                        Trace.endSection();
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 3:
                ch3.d0(obj);
                zt6 zt6Var = (zt6) obj3;
                wo8 wo8Var = (wo8) obj2;
                try {
                    AsynchronousFileChannel asynchronousFileChannelOpen = AsynchronousFileChannel.open(Paths.get(zt6Var.d.f, new String[0]), Collections.singleton(StandardOpenOption.READ), (ExecutorService) zt6Var.o.getValue(), new FileAttribute[0]);
                    o31 o31Var = (o31) zt6Var.h.getValue();
                    xt4 xt4Var = (xt4) zt6Var.p.getValue();
                    xt4Var.getClass();
                    return new b41(asynchronousFileChannelOpen, o31Var, cqk.a(lvb.x0(xt4Var, wo8Var)));
                } catch (Throwable th3) {
                    if (th3 instanceof IllegalArgumentException) {
                        message = "Illegal options passed for file channel opening";
                    } else if (th3 instanceof UnsupportedOperationException) {
                        message = "Asynchronous file access isn't supported";
                    } else {
                        message = th3.getMessage();
                        if (message == null) {
                            message = "Unknown exception while opening file channel";
                        }
                    }
                    throw new UploadUnhandledException.FileOpenException(message, th3);
                }
            case 4:
                ch3.d0(obj);
                ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream((Path) obj3, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)));
                try {
                    File[] fileArrListFiles = ((m2c) obj2).f().toFile().listFiles(new hc9(1));
                    if (fileArrListFiles == null) {
                        fileArrListFiles = new File[0];
                    }
                    for (File file : fileArrListFiles) {
                        zipOutputStream.setLevel(0);
                        zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                        zipOutputStream.write(lu6.n0(file));
                        zipOutputStream.closeEntry();
                    }
                    zipOutputStream.close();
                    return sbiVar;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        rx8.n(zipOutputStream, th4);
                        throw th5;
                    }
                }
            default:
                ch3.d0(obj);
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(Files.newOutputStream((Path) obj3, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)));
                try {
                    for (File file2 : ((Path) ((x3c) obj2).c.getValue()).toFile().listFiles()) {
                        zipOutputStream2.putNextEntry(new ZipEntry(file2.getName()));
                        zipOutputStream2.write(lu6.n0(file2));
                        zipOutputStream2.closeEntry();
                    }
                    zipOutputStream2.close();
                    return sbiVar;
                } catch (Throwable th6) {
                    try {
                        throw th6;
                    } catch (Throwable th7) {
                        rx8.n(zipOutputStream2, th6);
                        throw th7;
                    }
                }
        }
    }
}
