package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import com.vk.push.common.utils.FileExtensionKt;
import defpackage.b35;
import defpackage.cf7;
import defpackage.ch3;
import defpackage.e9i;
import defpackage.hu4;
import defpackage.lq4;
import defpackage.ore;
import defpackage.pdd;
import defpackage.poe;
import defpackage.qz9;
import defpackage.rdd;
import defpackage.sdd;
import defpackage.tdd;
import defpackage.vdd;
import defpackage.x8b;
import defpackage.xx6;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00142\u0006\u0010\u0010\u001a\u00020\tH\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lcom/vk/push/core/filedatastore/migration/PreferenceDataStoreByKeyMigration;", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "", "preferenceName", "", "Lvdd;", "keysToMigrate", "Lkotlin/Function1;", "Landroid/content/Context;", "Lb35;", "Lx8b;", "commonDataStoreProvider", "transform", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcf7;Lcf7;)V", "context", "", "shouldMigrate", "(Landroid/content/Context;Llq4;)Ljava/lang/Object;", "Lroe;", "migrate-gIAlu-s", "migrate", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PreferenceDataStoreByKeyMigration<T> implements Migration<T> {
    public final String a;
    public final List b;
    public final cf7 c;
    public final cf7 d;

    public PreferenceDataStoreByKeyMigration(String str, List<? extends vdd> list, cf7 cf7Var, cf7 cf7Var2) {
        this.a = str;
        this.b = list;
        this.c = cf7Var;
        this.d = cf7Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(b35 b35Var, lq4 lq4Var) {
        rdd rddVar;
        Serializable poeVar;
        if (lq4Var instanceof rdd) {
            rddVar = (rdd) lq4Var;
            int i = rddVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rddVar.f = i - Integer.MIN_VALUE;
            } else {
                rddVar = new rdd(this, lq4Var);
            }
        } else {
            rddVar = new rdd(this, lq4Var);
        }
        Object objN = rddVar.d;
        int i2 = rddVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objN);
                xx6 data = b35Var.getData();
                rddVar.f = 1;
                objN = e9i.N(data, rddVar);
                hu4 hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objN);
            }
            poeVar = Boolean.valueOf(!Collections.unmodifiableMap(((x8b) objN).a).keySet().isEmpty());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        return poeVar instanceof poe ? Boolean.FALSE : poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(b35 b35Var, lq4 lq4Var) {
        sdd sddVar;
        Serializable poeVar;
        if (lq4Var instanceof sdd) {
            sddVar = (sdd) lq4Var;
            int i = sddVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sddVar.g = i - Integer.MIN_VALUE;
            } else {
                sddVar = new sdd(this, lq4Var);
            }
        } else {
            sddVar = new sdd(this, lq4Var);
        }
        Object objN = sddVar.e;
        int i2 = sddVar.g;
        boolean z = true;
        try {
            if (i2 == 0) {
                ch3.d0(objN);
                xx6 data = b35Var.getData();
                sddVar.d = this;
                sddVar.g = 1;
                objN = e9i.N(data, sddVar);
                hu4 hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = sddVar.d;
                ch3.d0(objN);
            }
            Set setKeySet = Collections.unmodifiableMap(((x8b) objN).a).keySet();
            if (setKeySet != null && setKeySet.isEmpty()) {
                z = false;
                break;
            }
            Iterator<T> it = setKeySet.iterator();
            do {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
            } while (!this.b.contains((vdd) it.next()));
            poeVar = Boolean.valueOf(z);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        return poeVar instanceof poe ? Boolean.FALSE : poeVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[Catch: all -> 0x00ca, TRY_LEAVE, TryCatch #0 {all -> 0x00ca, blocks: (B:14:0x0030, B:37:0x00b8, B:39:0x00c0, B:19:0x0045, B:33:0x00a6, B:22:0x0054, B:29:0x007d, B:25:0x005e), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.vk.push.core.filedatastore.migration.Migration
    /* JADX INFO: renamed from: migrate-gIAlu-s */
    public Object mo22migrategIAlus(Context context, lq4 lq4Var) {
        tdd tddVar;
        Context context2;
        b35 b35Var;
        PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration;
        Object obj;
        b35 b35Var2;
        Context context3;
        if (lq4Var instanceof tdd) {
            tddVar = (tdd) lq4Var;
            int i = tddVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                tddVar.j = i - Integer.MIN_VALUE;
            } else {
                tddVar = new tdd(this, lq4Var);
            }
        } else {
            tddVar = new tdd(this, lq4Var);
        }
        Object objA = tddVar.h;
        int i2 = tddVar.j;
        lq4 lq4Var2 = null;
        int i3 = 1;
        hu4 hu4Var = hu4.a;
        try {
            if (i2 == 0) {
                ch3.d0(objA);
                b35 b35Var3 = (b35) this.c.invoke(context);
                xx6 data = b35Var3.getData();
                tddVar.d = context;
                tddVar.e = this;
                tddVar.f = b35Var3;
                tddVar.j = 1;
                Object objN = e9i.N(data, tddVar);
                if (objN != hu4Var) {
                    context2 = context;
                    b35Var = b35Var3;
                    objA = objN;
                }
                return hu4Var;
            }
            if (i2 == 1) {
                b35 b35Var4 = (b35) tddVar.f;
                PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration2 = tddVar.e;
                context2 = tddVar.d;
                ch3.d0(objA);
                b35Var = b35Var4;
                this = preferenceDataStoreByKeyMigration2;
            } else {
                if (i2 == 2) {
                    obj = tddVar.g;
                    b35 b35Var5 = (b35) tddVar.f;
                    PreferenceDataStoreByKeyMigration<T> preferenceDataStoreByKeyMigration3 = tddVar.e;
                    Context context4 = tddVar.d;
                    ch3.d0(objA);
                    b35Var2 = b35Var5;
                    preferenceDataStoreByKeyMigration = preferenceDataStoreByKeyMigration3;
                    context2 = context4;
                    tddVar.d = context2;
                    tddVar.e = preferenceDataStoreByKeyMigration;
                    tddVar.f = obj;
                    tddVar.g = null;
                    tddVar.j = 3;
                    objA = preferenceDataStoreByKeyMigration.a(b35Var2, tddVar);
                    if (objA != hu4Var) {
                        context3 = context2;
                    }
                    return hu4Var;
                }
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = tddVar.f;
                preferenceDataStoreByKeyMigration = tddVar.e;
                context3 = tddVar.d;
                ch3.d0(objA);
            }
            if (!((Boolean) objA).booleanValue()) {
                DataStoreMigrationKt.getFileToMigrate(context3, preferenceDataStoreByKeyMigration.a).delete();
            }
            return obj;
            Object objInvoke = this.d.invoke((x8b) objA);
            qz9 qz9Var = new qz9(this, lq4Var2, 26);
            tddVar.d = context2;
            tddVar.e = this;
            tddVar.f = b35Var;
            tddVar.g = objInvoke;
            tddVar.j = 2;
            if (b35Var.a(new pdd(qz9Var, lq4Var2, i3), tddVar) != hu4Var) {
                b35 b35Var6 = b35Var;
                preferenceDataStoreByKeyMigration = this;
                obj = objInvoke;
                b35Var2 = b35Var6;
                tddVar.d = context2;
                tddVar.e = preferenceDataStoreByKeyMigration;
                tddVar.f = obj;
                tddVar.g = null;
                tddVar.j = 3;
                objA = preferenceDataStoreByKeyMigration.a(b35Var2, tddVar);
                if (objA != hu4Var) {
                    context3 = context2;
                    if (!((Boolean) objA).booleanValue()) {
                        DataStoreMigrationKt.getFileToMigrate(context3, preferenceDataStoreByKeyMigration.a).delete();
                    }
                    return obj;
                }
            }
            return hu4Var;
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    @Override // com.vk.push.core.filedatastore.migration.Migration
    public Object shouldMigrate(Context context, lq4 lq4Var) {
        return FileExtensionKt.existsSafe(DataStoreMigrationKt.getFileToMigrate(context, this.a)) ? b((b35) this.c.invoke(context), lq4Var) : Boolean.FALSE;
    }
}
