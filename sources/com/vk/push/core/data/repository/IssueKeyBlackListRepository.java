package com.vk.push.core.data.repository;

import android.content.Context;
import com.vk.push.core.filedatastore.FileDataSource;
import defpackage.ch3;
import defpackage.hn8;
import defpackage.hu4;
import defpackage.in8;
import defpackage.j95;
import defpackage.lq4;
import defpackage.ore;
import defpackage.poe;
import defpackage.r5h;
import defpackage.r66;
import defpackage.roe;
import defpackage.sbi;
import defpackage.ww3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/vk/push/core/data/repository/IssueKeyBlackListRepository;", "", "Landroid/content/Context;", "context", "Lcom/vk/push/core/filedatastore/FileDataSource;", "fileDataSource", "<init>", "(Landroid/content/Context;Lcom/vk/push/core/filedatastore/FileDataSource;)V", "", "", "issueKeys", "Lsbi;", "setBlackList", "(Ljava/util/List;Llq4;)Ljava/lang/Object;", "getBlackList", "(Llq4;)Ljava/lang/Object;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IssueKeyBlackListRepository {

    @Deprecated
    public static final String FILE_NAME = "issue_keys_black_list.txt";
    public final FileDataSource a;

    public /* synthetic */ IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource, int i, j95 j95Var) {
        Context context2;
        if ((i & 2) != 0) {
            context2 = context;
            fileDataSource = new FileDataSource(context2, FILE_NAME, null, 4, null);
        } else {
            context2 = context;
        }
        this(context2, fileDataSource);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getBlackList(lq4 lq4Var) {
        hn8 hn8Var;
        Object objM18getDataIoAF18A;
        if (lq4Var instanceof hn8) {
            hn8Var = (hn8) lq4Var;
            int i = hn8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                hn8Var.f = i - Integer.MIN_VALUE;
            } else {
                hn8Var = new hn8(this, lq4Var);
            }
        } else {
            hn8Var = new hn8(this, lq4Var);
        }
        Object obj = hn8Var.d;
        int i2 = hn8Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            hn8Var.f = 1;
            objM18getDataIoAF18A = this.a.m18getDataIoAF18A(hn8Var);
            hu4 hu4Var = hu4.a;
            if (objM18getDataIoAF18A == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            objM18getDataIoAF18A = ((roe) obj).a;
        }
        String str = (String) (objM18getDataIoAF18A instanceof poe ? null : objM18getDataIoAF18A);
        return str != null ? r5h.m1(str, new String[]{","}, 6) : r66.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setBlackList(List<String> list, lq4 lq4Var) {
        in8 in8Var;
        if (lq4Var instanceof in8) {
            in8Var = (in8) lq4Var;
            int i = in8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                in8Var.f = i - Integer.MIN_VALUE;
            } else {
                in8Var = new in8(this, lq4Var);
            }
        } else {
            in8Var = new in8(this, lq4Var);
        }
        Object obj = in8Var.d;
        int i2 = in8Var.f;
        if (i2 == 0) {
            ch3.d0(obj);
            String strZ1 = ww3.z1(list, ",", null, null, null, 62);
            in8Var.f = 1;
            Object objM19setDatagIAlus = this.a.m19setDatagIAlus(strZ1, in8Var);
            hu4 hu4Var = hu4.a;
            if (objM19setDatagIAlus == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            ((roe) obj).getClass();
        }
        return sbi.a;
    }

    public IssueKeyBlackListRepository(Context context, FileDataSource fileDataSource) {
        this.a = fileDataSource;
    }
}
