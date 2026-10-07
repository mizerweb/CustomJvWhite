package com.facebook.soloader;

import defpackage.ng6;
import defpackage.og6;
import defpackage.pr6;
import defpackage.sr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends e {
    public final ng6[] a;

    public c(og6 og6Var, og6 og6Var2) throws IOException {
        File file = new File("/data/local/tmp/exopackage/" + og6Var.d.getPackageName() + "/native-libs/");
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String[] supportedAbis = SysUtil$MarshmallowSysdeps.getSupportedAbis();
        int length = supportedAbis.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            String str = supportedAbis[i2];
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                linkedHashSet.add(str);
                File file3 = new File(file2, "metadata.txt");
                if (file3.isFile()) {
                    FileReader fileReader = new FileReader(file3);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    bufferedReader.close();
                                    fileReader.close();
                                    break;
                                }
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf == -1) {
                                        throw new RuntimeException("illegal line in exopackage metadata: [" + line + "]");
                                    }
                                    String str2 = line.substring(i, iIndexOf) + ".so";
                                    int size = arrayList.size();
                                    int i3 = i;
                                    while (true) {
                                        if (i3 >= size) {
                                            String strSubstring = line.substring(iIndexOf + 1);
                                            arrayList.add(new ng6(new File(file2, strSubstring), str2, strSubstring.substring(strSubstring.indexOf(45), strSubstring.indexOf(".so"))));
                                            break;
                                        } else if (((String) ((ng6) arrayList.get(i3)).a).equals(str2)) {
                                            break;
                                        } else {
                                            i3++;
                                        }
                                    }
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                            try {
                                fileReader.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        }
                    } catch (Throwable th4) {
                        fileReader.close();
                        throw th4;
                    }
                }
                continue;
            }
            i2++;
            i = 0;
        }
        this.a = (ng6[]) arrayList.toArray(new ng6[arrayList.size()]);
    }

    @Override // com.facebook.soloader.e
    public final sr[] l() {
        return this.a;
    }

    @Override // com.facebook.soloader.e
    public final void y(File file) throws IOException {
        byte[] bArr = new byte[PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS];
        for (ng6 ng6Var : this.a) {
            FileInputStream fileInputStream = new FileInputStream(ng6Var.c);
            try {
                pr6 pr6Var = new pr6(ng6Var, 2, fileInputStream);
                fileInputStream = null;
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
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th3;
            }
        }
    }
}
