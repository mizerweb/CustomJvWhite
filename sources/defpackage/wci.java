package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.facebook.soloader.e;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wci extends mm5 {
    public final Context d;

    public wci(Context context, String str) {
        super(f(context, str), 1);
        this.d = context;
    }

    public static File f(Context context, String str) {
        return new File(qt4.q(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    public static void i(File file, byte b, boolean z) throws IOException {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (z) {
                    randomAccessFile.getFD().sync();
                }
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
        }
    }

    @Override // defpackage.rcg
    public final void d(int i) {
        File file = this.a;
        if (!file.mkdirs() && !file.isDirectory()) {
            qr7.k(zo5.m(file, "cannot mkdir: "));
            return;
        }
        if (!file.canWrite() && !file.setWritable(true)) {
            throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
        }
        pr6 pr6Var = null;
        try {
            try {
                pr6 pr6VarD = kfh.d(file, new File(file, "dso_lock"));
                try {
                    o7j.j("fb-UnpackingSoSource", "locked dso store " + file);
                    if (!file.canWrite() && !file.setWritable(true)) {
                        throw new IOException("error adding " + file.getCanonicalPath() + " write permission");
                    }
                    if (!h(pr6VarD, i)) {
                        String str = "dso store is up-to-date: " + file;
                        if (Log.isLoggable("fb-UnpackingSoSource", 4)) {
                            Log.i("fb-UnpackingSoSource", str);
                        }
                        pr6Var = pr6VarD;
                    }
                    if (pr6Var != null) {
                        o7j.j("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        pr6Var.close();
                    } else {
                        o7j.j("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    if (!file.canWrite() || file.setWritable(false)) {
                        return;
                    }
                    throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
                } catch (Throwable th) {
                    th = th;
                    pr6Var = pr6VarD;
                    if (pr6Var != null) {
                        o7j.j("fb-UnpackingSoSource", "releasing dso store lock for " + file);
                        pr6Var.close();
                    } else {
                        o7j.j("fb-UnpackingSoSource", "not releasing dso store lock for " + file + " (syncer thread started)");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (!file.canWrite() || file.setWritable(false)) {
                throw th3;
            }
            throw new IOException("error removing " + file.getCanonicalPath() + " write permission");
        }
    }

    public byte[] e() {
        Parcel parcelObtain = Parcel.obtain();
        e eVarG = g(false);
        try {
            sr[] srVarArrL = eVarG.l();
            parcelObtain.writeInt(srVarArrL.length);
            for (sr srVar : srVarArrL) {
                parcelObtain.writeString((String) srVar.a);
                parcelObtain.writeString((String) srVar.b);
            }
            eVarG.close();
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            return bArrMarshall;
        } catch (Throwable th) {
            try {
                eVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract e g(boolean z);

    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[Catch: all -> 0x0097, IOException -> 0x009a, TRY_LEAVE, TryCatch #2 {IOException -> 0x009a, blocks: (B:37:0x007c, B:39:0x0082), top: B:92:0x007c, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:92:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0082, please report this as an issue */
    public final boolean h(pr6 pr6Var, int i) throws IOException {
        byte b;
        boolean z;
        RandomAccessFile randomAccessFile;
        File file = this.a;
        File file2 = new File(file, "dso_state");
        byte[] bArrE = e();
        boolean z2 = (i & 2) != 0;
        if (z2) {
            b = 0;
        } else {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
                try {
                    if (randomAccessFile2.length() != 0) {
                        int length = (int) randomAccessFile2.length();
                        byte[] bArr = new byte[length];
                        if (randomAccessFile2.read(bArr) != length) {
                            o7j.j("fb-UnpackingSoSource", "short read of so store deps file: marking unclean");
                        } else {
                            z = !Arrays.equals(bArr, bArrE);
                            randomAccessFile2.close();
                        }
                        if (z) {
                            b = 0;
                        } else {
                            randomAccessFile = new RandomAccessFile(file2, "rw");
                            try {
                                if (randomAccessFile.length() == 1) {
                                    try {
                                        b = randomAccessFile.readByte();
                                        if (b == 1) {
                                            o7j.j("fb-UnpackingSoSource", "dso store " + file + " regeneration not needed: state file clean");
                                        } else {
                                            b = 0;
                                        }
                                    } catch (IOException e) {
                                        o7j.j("fb-UnpackingSoSource", "dso store " + file + " regeneration interrupted: " + e.getMessage());
                                    }
                                } else {
                                    b = 0;
                                }
                                randomAccessFile.close();
                            } catch (Throwable th) {
                                try {
                                    randomAccessFile.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        }
                    }
                    randomAccessFile2.close();
                    z = true;
                    if (z) {
                        randomAccessFile = new RandomAccessFile(file2, "rw");
                        if (randomAccessFile.length() == 1) {
                            b = randomAccessFile.readByte();
                            if (b == 1) {
                                o7j.j("fb-UnpackingSoSource", "dso store " + file + " regeneration not needed: state file clean");
                            } else {
                                b = 0;
                            }
                        } else {
                            b = 0;
                        }
                        randomAccessFile.close();
                    } else {
                        b = 0;
                    }
                } catch (Throwable th3) {
                    try {
                        randomAccessFile2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (IOException e2) {
                Log.w("fb-UnpackingSoSource", "failed to compare whether deps changed", e2);
            }
        }
        if (b == 1) {
            return false;
        }
        boolean z3 = (i & 4) == 0;
        o7j.j("fb-UnpackingSoSource", "so store dirty: regenerating");
        i(file2, (byte) 0, z3);
        File[] fileArrListFiles = file.listFiles(new rab(1));
        if (fileArrListFiles == null) {
            qr7.k(zo5.m(file, "unable to list directory "));
            return false;
        }
        for (File file3 : fileArrListFiles) {
            o7j.j("fb-UnpackingSoSource", "Deleting " + file3);
            kfh.b(file3);
        }
        e eVarG = g(z2);
        try {
            eVarG.y(file);
            eVarG.close();
            RandomAccessFile randomAccessFile3 = new RandomAccessFile(new File(file, "dso_deps"), "rw");
            try {
                randomAccessFile3.write(bArrE);
                randomAccessFile3.setLength(randomAccessFile3.getFilePointer());
                randomAccessFile3.close();
                vci vciVar = new vci(this, z3, file2, pr6Var);
                if ((i & 1) != 0) {
                    new Thread(vciVar, "SoSync:" + file.getName()).start();
                } else {
                    vciVar.run();
                }
                return true;
            } catch (Throwable th5) {
                try {
                    randomAccessFile3.close();
                    throw th5;
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            try {
                eVarG.close();
                throw th7;
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
                throw th7;
            }
        }
    }
}
