package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.facebook.soloader.NoBaseApkException;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import javax.inject.Provider;
import one.me.calls.ui.bottomsheet.unkowncontact.UnknownContactBottomSheet;
import one.video.upload.exceptions.InvalidHttpResponseException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.audio.JavaAudioDeviceModule;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class kzi implements r9b, JavaAudioDeviceModule.AudioRecordStateCallback, JavaAudioDeviceModule.AudioRecordErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback, JavaAudioDeviceModule.AudioTrackErrorCallback, rxe, t65, iee, zx7, ds7, mf7, iu3, wp {
    public static ayj d;
    public Object a;
    public Object b;
    public static final Object c = new Object();
    public static final kzi e = new kzi("", (Object) null);

    public kzi(int i) {
        switch (i) {
            case 27:
                this.a = new rp4(R.id.link_context_menu_action_open_call, new tnh(R.string.link_context_menu_action_open_phone_link), Integer.valueOf(R.drawable.icon_call), (Integer) null, 20);
                this.b = new rp4(R.id.link_context_menu_action_copy_call, new tnh(R.string.link_context_menu_action_copy_phone_link), Integer.valueOf(R.drawable.icon_copy), (Integer) null, 20);
                break;
            default:
                this.a = c76.a;
                this.b = s66.a;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static kzi l(Context context) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new kzi(channel, fileLockLock, false);
                } catch (IOException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e3) {
                    e = e3;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e4) {
                    e = e4;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e5) {
                e = e5;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e6) {
            e = e6;
            channel = null;
            fileLockLock = null;
        }
    }

    public static kam m(Context context, Intent intent, boolean z) {
        ayj ayjVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (c) {
            try {
                if (d == null) {
                    d = new ayj(context);
                }
                ayjVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return ayjVar.b(intent).l(new sv(1), new o75(28));
        }
        if (ljf.D().L(context)) {
            synchronized (tpk.a) {
                try {
                    tpk.b(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        tpk.b.a();
                    }
                    ayjVar.b(intent).b(new vuf(28, intent));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            ayjVar.b(intent);
        }
        return gwl.e(-1);
    }

    public void A() {
        try {
            ((FileLock) this.b).release();
            ((FileChannel) this.a).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b5 A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #1 {all -> 0x00b6, blocks: (B:60:0x00b5, B:63:0x00b8, B:64:0x00d0), top: B:68:0x00b3 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:60:0x00b5, B:63:0x00b8, B:64:0x00d0), top: B:68:0x00b3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x00b8, please report this as an issue */
    @Override // defpackage.rxe
    public qxe a(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        th5 th5Var = (th5) this.b;
        if (!str.equals(":memory:")) {
            str = ((l35) th5Var.c).a.getDatabasePath(str).getAbsolutePath();
        }
        boolean z = true;
        ld6 ld6Var = new ld6(str, (th5Var.a || th5Var.b || cqk.d(str, ":memory:")) ? false : true);
        ReentrantLock reentrantLock = ld6Var.a;
        reentrantLock.lock();
        uvc uvcVar = ld6Var.b;
        if (uvcVar != null) {
            try {
                uvcVar.j();
            } catch (Throwable th) {
                th = th;
                z = false;
                try {
                    if (z) {
                        throw th;
                    }
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
        try {
            try {
                if (th5Var.b) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                qxe qxeVarA = ((rxe) this.a).a(str);
                if (th5Var.a) {
                    th5.f(qxeVarA);
                    if (((l35) th5Var.c).g == 3) {
                        n1g.u(qxeVarA, "PRAGMA synchronous = NORMAL");
                    } else {
                        n1g.u(qxeVarA, "PRAGMA synchronous = FULL");
                    }
                    ((pic) th5Var.d).s(qxeVarA);
                } else {
                    try {
                        th5Var.b = true;
                        th5.a(th5Var, qxeVarA);
                        th5Var.b = false;
                    } catch (Throwable th3) {
                        th5Var.b = false;
                        throw th3;
                    }
                }
                if (uvcVar != null && (fileChannel2 = (FileChannel) uvcVar.c) != null) {
                    try {
                        fileChannel2.close();
                        uvcVar.c = null;
                    } catch (Throwable th4) {
                        uvcVar.c = null;
                        throw th4;
                    }
                }
                reentrantLock.unlock();
                return qxeVarA;
            } catch (Throwable th5) {
                if (uvcVar != null && (fileChannel = (FileChannel) uvcVar.c) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        uvcVar.c = null;
                    }
                }
                throw th5;
            }
        } catch (Throwable th6) {
            th = th6;
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        }
    }

    @Override // defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return ((mf7) ((ex8) this.a).b).mo41apply(obj);
    }

    @Override // defpackage.r9b
    public void b(int i) {
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "setOrientationDegrees, degrees="), null);
            }
        }
        ((r9b) this.a).b(i);
    }

    @Override // defpackage.iu3
    public i95 c(b87 b87Var, LogSessionId logSessionId) {
        return ((ka5) this.a).c(b87Var, logSessionId);
    }

    @Override // defpackage.wp
    public uo d(uo uoVar) {
        un unVar = (un) ((i18) ((to) this.a)).a(new tn((String) this.b), uoVar);
        return uoVar.e(unVar.a, unVar.b);
    }

    @Override // defpackage.r9b
    public void e(int i, String str) {
        String str2;
        String str3 = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                if (i == 0) {
                    str2 = "MUXER_FORMAT_MPEG_4";
                } else if (i != 1) {
                    str2 = i != 2 ? "MUXER_FORMAT_UNKNOWN" : "MUXER_FORMAT_3GPP";
                } else {
                    str2 = "MUXER_FORMAT_WEBM";
                }
                a4cVar.c(je9Var, str3, qv1.l("setOutput, path=", str, ", format=", str2), null);
            }
        }
        ((r9b) this.a).e(i, str);
    }

    @Override // defpackage.iu3
    public boolean f() {
        return true;
    }

    @Override // defpackage.zx7
    public qmc g(wx7 wx7Var, sx7 sx7Var) {
        return new fik(((zx7) this.a).g(wx7Var, sx7Var), 17, (List) this.b);
    }

    @Override // defpackage.r9b
    public void h(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((r9b) this.a).h(i, byteBuffer, bufferInfo);
    }

    @Override // defpackage.r9b
    public int i(MediaFormat mediaFormat) {
        je9 je9Var = je9.d;
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "-> addTrack " + mediaFormat, null);
        }
        int i = ((r9b) this.a).i(mediaFormat);
        String str2 = (String) this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.h(i, "<- addTrack index="), null);
        }
        return i;
    }

    @Override // defpackage.r9b
    public void j(int i) {
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(i, "setCaptureFps, captureFps="), null);
            }
        }
        ((r9b) this.a).j(i);
    }

    @Override // defpackage.rxe
    public boolean k() {
        return ((rxe) this.a).k();
    }

    @Override // defpackage.iu3
    public boolean n() {
        return ((ka5) this.b).n();
    }

    @Override // defpackage.zx7
    public qmc o() {
        return new fik(((zx7) this.a).o(), 17, (List) this.b);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordError(String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio record error: " + str);
        ((vzf) this.b).invoke(new d80("record", "run", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordInitError(String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio record init error: " + str);
        ((vzf) this.b).invoke(new d80("record", "init", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStart() {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio record did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback
    public void onWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio record start error: [" + audioRecordStartErrorCode + "] " + str);
        ((vzf) this.b).invoke(new d80("record", "start", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback
    public void onWebRtcAudioRecordStop() {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio record did stop");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackError(String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio track error: " + str);
        ((vzf) this.b).invoke(new d80("playback", "run", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackInitError(String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio track init error: " + str);
        ((vzf) this.b).invoke(new d80("playback", "init", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStart() {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio track did start");
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback
    public void onWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio track start error: [" + audioTrackStartErrorCode + "] " + str);
        ((vzf) this.b).invoke(new d80("playback", "start", str));
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback
    public void onWebRtcAudioTrackStop() {
        ((CidLogger) this.a).log("AudioRecordCallback", "Audio track did stop");
    }

    @Override // defpackage.iu3
    public i95 p(b87 b87Var, LogSessionId logSessionId) {
        ex3 ex3Var = b87Var.D;
        if (ex3Var != null && ex3Var.b != 2) {
            a87 a87VarA = b87Var.a();
            dx3 dx3VarA = ex3Var.a();
            dx3VarA.b = 2;
            a87VarA.C = dx3VarA.a();
            b87Var = new b87(a87VarA);
        }
        return ((ka5) this.b).p(b87Var, logSessionId);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory q(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.b) == null) {
            Context context = (Context) this.a;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), np0.m);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.b = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.b = map;
        }
        String str4 = (String) ((Map) this.b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e2) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (InstantiationException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
            return null;
        }
    }

    public ynh r() {
        return (ynh) this.b;
    }

    @Override // defpackage.ds7
    public String readLine() throws InvalidHttpResponseException {
        kr6 kr6Var = (kr6) this.b;
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                break;
            }
            if (i != 10) {
                if (i == 13) {
                    int i2 = byteArrayInputStream.read();
                    if (i2 == -1) {
                        break;
                    }
                    if (i2 != 10) {
                        throw kr6Var.z("Invalid CR unfollowed by LF", new String(byteArrayOutputStream.toByteArray(), pt2.a), null);
                    }
                } else {
                    byteArrayOutputStream.write(i);
                }
            }
            return new String(byteArrayOutputStream.toByteArray(), pt2.a);
        }
        return null;
    }

    @Override // defpackage.r9b
    public void release() {
        je9 je9Var = je9.d;
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "-> release", null);
        }
        ((r9b) this.a).release();
        String str2 = (String) this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "<- release", null);
        }
    }

    public String s() {
        return (String) this.b;
    }

    @Override // defpackage.ds7
    public long skip(long j) {
        return ((ByteArrayInputStream) this.a).skip(j);
    }

    @Override // defpackage.r9b
    public void start() {
        je9 je9Var = je9.d;
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "-> start", null);
        }
        ((r9b) this.a).start();
        String str2 = (String) this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "<- start", null);
        }
    }

    @Override // defpackage.r9b
    public void stop() {
        je9 je9Var = je9.d;
        String str = (String) this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "-> stop", null);
        }
        ((r9b) this.a).stop();
        String str2 = (String) this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "<- stop", null);
        }
    }

    @Override // defpackage.t65
    public Object t() {
        Bundle bundle = (Bundle) this.a;
        return new UnknownContactBottomSheet(sb8.j0(bundle, "call_id"), sb8.h0(bundle, "caller_id"), (ha9) this.b);
    }

    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        String str = ((Context) this.a).getApplicationInfo().sourceDir;
        if (!new File(str).exists()) {
            StringBuilder sbV = qt4.v("Base apk does not exist: ", str, ". ");
            ((mf) this.b).x(sbV);
            throw new NoBaseApkException(sbV.toString(), unsatisfiedLinkError);
        }
        Log.w("soloader.recovery.CheckBaseApkExists", "Base apk exists: " + str);
        return false;
    }

    public ynh v() {
        return (ynh) this.a;
    }

    public void w() {
        ek2 ek2Var = (ek2) this.b;
        if ((ek2Var.t() instanceof hib) && ((AtomicBoolean) this.a).compareAndSet(false, true)) {
            ek2Var.resumeWith(null);
        }
    }

    public void x(String str, CameraDevice.StateCallback stateCallback) {
        zqh zqhVar = (zqh) this.b;
        CameraManager cameraManager = (CameraManager) ((Provider) this.a).get();
        try {
            Trace.beginSection(((Object) ef2.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.openCamera(str, (Executor) zqhVar.j.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, zqhVar.a());
            }
        } finally {
            Trace.endSection();
        }
    }

    public l5g y(JSONObject jSONObject, dnf dnfVar) {
        uvc uvcVar;
        try {
            jSONObject.optBoolean("markerFound");
            jSONObject.optInt("countBefore");
            jSONObject.optInt("countAfter");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("participants");
            if (jSONArrayOptJSONArray != null) {
                uvcVar = ((ljf) this.b).T(jSONArrayOptJSONArray, dnfVar);
            } else {
                r66 r66Var = r66.a;
                uvcVar = new uvc(r66Var, c76.a, r66Var);
            }
            return new l5g(uvcVar);
        } catch (JSONException e2) {
            ((CidLogger) this.a).logException("ParticipantListChunkParser", "Can't parse participant chunk", e2);
            return null;
        }
    }

    public kam z(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.a;
        sv svVar = (sv) this.b;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? gwl.c(new vs4(context, 6, intent), svVar).f(svVar, new jn6(context, intent, z2)) : m(context, intent, z2);
    }

    public /* synthetic */ kzi(Object obj, Object obj2, boolean z) {
        this.a = obj;
        this.b = obj2;
    }

    public kzi(r9b r9bVar) {
        this.a = r9bVar;
        this.b = kzi.class.getName();
    }

    public kzi(Context context, int i) {
        switch (i) {
            case 22:
                this.b = null;
                this.a = context;
                break;
            default:
                this.a = context;
                this.b = new sv(1);
                break;
        }
    }

    public kzi(Set set) {
        lvb.b0(!set.isEmpty());
        lvb.Z("trackTypes must only contain TRACK_TYPE_AUDIO and/or TRACK_TYPE_VIDEO.", t26.e.containsAll(set));
        this.b = u98.m(set);
        this.a = new z88(4);
    }

    public kzi(s26... s26VarArr) {
        int i = u98.c;
        this.b = new jag(-2);
        z88 z88Var = new z88(4);
        z88Var.d(s26VarArr);
        this.a = z88Var;
    }

    public /* synthetic */ kzi(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public kzi(ka5 ka5Var) {
        this.b = ka5Var;
        this.a = ka5Var;
    }
}
