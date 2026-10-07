package com.vk.push.core.filedatastore;

import android.content.Context;
import defpackage.ao5;
import defpackage.ch3;
import defpackage.cqk;
import defpackage.el6;
import defpackage.eu6;
import defpackage.fze;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.ifh;
import defpackage.j95;
import defpackage.lb5;
import defpackage.lq4;
import defpackage.lq6;
import defpackage.mq6;
import defpackage.ore;
import defpackage.qr7;
import defpackage.qv;
import defpackage.roe;
import defpackage.vt4;
import defpackage.yab;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/vk/push/core/filedatastore/FileDataSource;", "", "Landroid/content/Context;", "context", "", "fileName", "Lgu4;", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lgu4;)V", "Lroe;", "getData-IoAF18A", "(Llq4;)Ljava/lang/Object;", "getData", "data", "Lsbi;", "setData-gIAlu-s", "(Ljava/lang/String;Llq4;)Ljava/lang/Object;", "setData", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileDataSource {

    @Deprecated
    public static final String FILE_DATASOURCE_DIR = "vkpns";
    public final Context a;
    public final String b;
    public final gu4 c;
    public final ifh d;

    public FileDataSource(Context context, String str, gu4 gu4Var) {
        this.a = context;
        this.b = str;
        this.c = gu4Var;
        this.d = new ifh(new qv(2, this));
    }

    public static void a(File file) throws IOException {
        if (file.canRead() && file.canWrite()) {
            return;
        }
        eu6.d(file.getPath(), "Can't access ");
    }

    public static final File access$getFileSource(FileDataSource fileDataSource) {
        return (File) fileDataSource.d.getValue();
    }

    public static final File access$getOrCreateFile(FileDataSource fileDataSource) throws IOException {
        File file = new File(fileDataSource.a.getFilesDir().getPath() + "/vkpns");
        if ((!file.exists() || !file.isDirectory()) && !file.mkdir()) {
            qr7.k("Can't create vkpns dir");
            return null;
        }
        a(file);
        File file2 = new File(file.getPath() + '/' + fileDataSource.b);
        if (file2.exists() && file2.isFile()) {
            a(file2);
            return file2;
        }
        boolean zCreateNewFile = file2.createNewFile();
        String str = "Can't create " + file2.getPath() + " file";
        if (zCreateNewFile) {
            a(file2);
            return file2;
        }
        qr7.k(str);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getData-IoAF18A */
    public final Object m18getDataIoAF18A(lq4 lq4Var) {
        lq6 lq6Var;
        if (lq4Var instanceof lq6) {
            lq6Var = (lq6) lq4Var;
            int i = lq6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                lq6Var.f = i - Integer.MIN_VALUE;
            } else {
                lq6Var = new lq6(this, lq4Var);
            }
        } else {
            lq6Var = new lq6(this, lq4Var);
        }
        Object objK0 = lq6Var.d;
        int i2 = lq6Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            vt4 vt4VarK = this.c.k();
            el6 el6Var = new el6(this, (lq4) null, 1);
            lq6Var.f = 1;
            objK0 = yab.K0(vt4VarK, el6Var, lq6Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: setData-gIAlu-s */
    public final Object m19setDatagIAlus(String str, lq4 lq4Var) {
        mq6 mq6Var;
        if (lq4Var instanceof mq6) {
            mq6Var = (mq6) lq4Var;
            int i = mq6Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mq6Var.f = i - Integer.MIN_VALUE;
            } else {
                mq6Var = new mq6(this, lq4Var);
            }
        } else {
            mq6Var = new mq6(this, lq4Var);
        }
        Object objK0 = mq6Var.d;
        int i2 = mq6Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            vt4 vt4VarK = this.c.k();
            fze fzeVar = new fze(this, str, (lq4) null, 28);
            mq6Var.f = 1;
            objK0 = yab.K0(vt4VarK, fzeVar, mq6Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return ((roe) objK0).a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileDataSource(Context context, String str, gu4 gu4Var, int i, j95 j95Var) {
        if ((i & 4) != 0) {
            ao5 ao5Var = ao5.a;
            gu4Var = cqk.a(lb5.c);
        }
        this(context, str, gu4Var);
    }
}
