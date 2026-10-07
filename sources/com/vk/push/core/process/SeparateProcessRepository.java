package com.vk.push.core.process;

import android.content.Context;
import com.vk.push.core.domain.repository.MetadataRepository;
import defpackage.ifh;
import defpackage.nhf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/vk/push/core/process/SeparateProcessRepository;", "", "Landroid/content/Context;", "applicationContext", "Lcom/vk/push/core/domain/repository/MetadataRepository;", "metadataRepository", "<init>", "(Landroid/content/Context;Lcom/vk/push/core/domain/repository/MetadataRepository;)V", "", "isMultiProcessMode", "()Z", "isSeparateProcess", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SeparateProcessRepository {
    public final Context a;
    public final MetadataRepository b;
    public final ifh c = new ifh(new nhf(this, 0));
    public final ifh d = new ifh(new nhf(this, 1));

    public SeparateProcessRepository(Context context, MetadataRepository metadataRepository) {
        this.a = context;
        this.b = metadataRepository;
    }

    public final boolean isMultiProcessMode() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean isSeparateProcess() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }
}
