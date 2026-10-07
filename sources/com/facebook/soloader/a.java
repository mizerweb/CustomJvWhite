package com.facebook.soloader;

import android.util.Log;
import defpackage.ij6;
import defpackage.nbh;
import defpackage.o7j;
import defpackage.pr6;
import defpackage.qv1;
import defpackage.sr;
import defpackage.wn0;
import defpackage.zo5;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {
    public ij6[] a;
    public final ZipFile b;
    public final wn0 c;
    public final /* synthetic */ wn0 d;
    public final boolean e;
    public final File f;
    public final int g;

    public a(wn0 wn0Var, wn0 wn0Var2, boolean z) {
        this.d = wn0Var;
        this.b = new ZipFile(wn0Var.e);
        this.c = wn0Var2;
        this.e = z;
        this.f = new File(wn0Var.d.getApplicationInfo().nativeLibraryDir);
        this.g = wn0Var.g;
    }

    public final ij6[] A() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap map = new HashMap();
        Pattern patternCompile = Pattern.compile(this.d.f);
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        Enumeration<? extends ZipEntry> enumerationEntries = this.b.entries();
        while (enumerationEntries.hasMoreElements()) {
            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
            Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                int i = 0;
                while (true) {
                    if (i >= supportedAbis.length) {
                        i = -1;
                        break;
                    }
                    String str = supportedAbis[i];
                    if (str != null && strGroup.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    linkedHashSet.add(strGroup);
                    ij6 ij6Var = (ij6) map.get(strGroup2);
                    if (ij6Var == null || i < ij6Var.d) {
                        map.put(strGroup2, new ij6(strGroup2, zipEntryNextElement, i));
                    }
                }
            }
        }
        this.c.getClass();
        ij6[] ij6VarArr = (ij6[]) map.values().toArray(new ij6[map.size()]);
        Arrays.sort(ij6VarArr);
        return ij6VarArr;
    }

    public final ij6[] E() {
        ij6[] ij6VarArr = this.a;
        if (ij6VarArr != null) {
            return ij6VarArr;
        }
        ij6[] ij6VarArrA = A();
        this.a = ij6VarArrA;
        if (this.e) {
            Log.w("BackupSoSource", "Unconditonally extracting all DSOs from zip");
            return this.a;
        }
        if ((this.g & 1) == 0) {
            Log.w("BackupSoSource", "Self-extraction preferred (PREFER_ANDROID_LIBS_DRIECTORY not set)");
            return this.a;
        }
        for (ij6 ij6Var : ij6VarArrA) {
            ZipEntry zipEntry = ij6Var.c;
            String str = (String) ij6Var.a;
            String name = zipEntry.getName();
            File file = this.f;
            File file2 = new File(file, str);
            try {
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    if (file2.isFile()) {
                        long length = file2.length();
                        long size = zipEntry.getSize();
                        if (length != size) {
                            StringBuilder sb = new StringBuilder("Allowing consideration of ");
                            sb.append(file2);
                            sb.append(": sysdir file length is ");
                            sb.append(length);
                            Log.w("BackupSoSource", zo5.k(size, ", but the file is ", " bytes long in the APK", sb));
                        } else {
                            Log.w("BackupSoSource", "Not allowing consideration of " + name + ": deferring to libdir");
                        }
                    } else {
                        Log.w("BackupSoSource", nbh.w("Allowing consideration of ", name, ": ", str, " not in system lib dir"));
                    }
                    return this.a;
                }
                o7j.b("BackupSoSource", "Not allowing consideration of " + name + ": " + str + " not in lib dir.");
            } catch (IOException e) {
                StringBuilder sbQ = qv1.q("Not allowing consideration of ", name, ": ", str, ", IOException when constructing path: ");
                sbQ.append(e.toString());
                Log.w("BackupSoSource", sbQ.toString());
            }
        }
        ij6[] ij6VarArr2 = new ij6[0];
        this.a = ij6VarArr2;
        return ij6VarArr2;
    }

    @Override // com.facebook.soloader.e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.facebook.soloader.e
    public final sr[] l() {
        return E();
    }

    @Override // com.facebook.soloader.e
    public final void y(File file) throws IOException {
        ij6[] ij6VarArrE = E();
        byte[] bArr = new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS];
        for (ij6 ij6Var : ij6VarArrE) {
            InputStream inputStream = this.b.getInputStream(ij6Var.c);
            try {
                pr6 pr6Var = new pr6(ij6Var, 2, inputStream);
                inputStream = null;
                try {
                    e.b(pr6Var, bArr, file);
                    pr6Var.close();
                } catch (Throwable th) {
                    try {
                        pr6Var.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th3;
            }
        }
    }
}
