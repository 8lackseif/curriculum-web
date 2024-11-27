type MediaVideo = {
    url: string | undefined;
    secureUrl: string | null | undefined;
    type: string | null | undefined;
    width: string | undefined;
    height: string | undefined;
};

export type FirstType = {
    url: string;
    title: string;
    siteName: string | undefined;
    description: string | undefined;
    mediaType: string;
    contentType: string | undefined;
    images: string[];
    videos: MediaVideo[];
    favicons: string[];
};

export type SecondType = {
    charset: string | null;
    url: string;
    mediaType: string;
    contentType: string;
    favicons: string[];
};

export type ThirdType = {
    charset: string | null;
    url: string;
    title: string;
    siteName: string | undefined;
    description: string | undefined;
    mediaType: string;
    contentType: string | undefined;
    images: string[];
    videos: MediaVideo[];
    favicons: string[];
};

export type PreviewData = FirstType | SecondType | ThirdType;
    