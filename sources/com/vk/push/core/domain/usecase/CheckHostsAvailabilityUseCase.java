package com.vk.push.core.domain.usecase;

import com.vk.push.core.domain.repository.PackagesRepository;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/push/core/domain/usecase/CheckHostsAvailabilityUseCase;", "", "Lcom/vk/push/core/domain/repository/PackagesRepository;", "packagesRepository", "<init>", "(Lcom/vk/push/core/domain/repository/PackagesRepository;)V", "", "invoke", "()Z", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CheckHostsAvailabilityUseCase {
    public final PackagesRepository a;

    public CheckHostsAvailabilityUseCase(PackagesRepository packagesRepository) {
        this.a = packagesRepository;
    }

    public final boolean invoke() {
        return !this.a.getInitializedHostPackages().isEmpty();
    }
}
