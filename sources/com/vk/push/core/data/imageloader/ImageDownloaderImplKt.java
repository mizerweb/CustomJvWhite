package com.vk.push.core.data.imageloader;

import com.vk.push.common.logger.LoggerProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"ImageDownloader", "Lcom/vk/push/core/data/imageloader/ImageDownloader;", "loggerProvider", "Lcom/vk/push/common/logger/LoggerProvider;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ImageDownloaderImplKt {
    public static final ImageDownloader ImageDownloader(LoggerProvider loggerProvider) {
        return new ImageDownloaderImpl(loggerProvider);
    }
}
