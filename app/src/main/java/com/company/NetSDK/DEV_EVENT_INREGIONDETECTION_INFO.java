package com.company.NetSDK;

import java.io.Serializable;

/**
 * \if ENGLISH_LANG
 * the describe of EVENT_IVS_INREGIONDETECTION's data
 * \else
 * �¼�����EVENT_IVS_INREGIONDETECTION(�����ڼ���¼�)��Ӧ�����ݿ�������Ϣ
 * \endif
 */
public class DEV_EVENT_INREGIONDETECTION_INFO implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * \if ENGLISH_LANG
	 * ChannelId
	 * \else
	 * ͨ����
	 * \endif
	 */
	public int                 nChannelID;
	
	/**
	 * \if ENGLISH_LANG
	 * event name
	 * \else
	 * �¼�����
	 * \endif
	 */
    public byte                szName[] = new byte[128];
    
    /**
	 * \if ENGLISH_LANG
	 * PTS(ms)
	 * \else
	 * ʱ���(��λ�Ǻ���)
	 * \endif
	 */
    public double              PTS;
    
    /**
	 * \if ENGLISH_LANG
	 * the event happen time
	 * \else
	 * �¼�������ʱ��
	 * \endif
	 */
    public NET_TIME_EX         UTC = new NET_TIME_EX();
    
    /**
	 * \if ENGLISH_LANG
	 * event ID
	 * \else
	 * �¼�ID
	 * \endif
	 */
    public int                 nEventID;
    
    /**
	 * \if ENGLISH_LANG
	 * have being detected objects number
	 * \else
	 * ��⵽���������
	 * \endif
	 */
    public int                 nObjectNum;
    
    /**
	 * \if ENGLISH_LANG
	 * have being detected objects
	 * \else
	 * ��⵽������
	 * \endif
	 */
    public SDK_MSG_OBJECT       stuObjectIDs[] = new SDK_MSG_OBJECT[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * track line number
	 * \else
	 * �켣��(���⵽�����������Ӧ)
	 * \endif
	 */
    public int                 nTrackNum;
    
    /**
	 * \if ENGLISH_LANG
	 * track lines info
	 * \else
	 * �켣��Ϣ(���⵽�������Ӧ)
	 * \endif
	 */
    public SDK_POLY_POINTS      stuTrackInfo[] = new SDK_POLY_POINTS[FinalVar.SDK_MAX_OBJECT_LIST];
    
    /**
	 * \if ENGLISH_LANG
	 * detect regions number
	 * \else
	 * ���������򶥵���
	 * \endif
	 */
    public int                 nDetectRegionNum;
    
    /**
	 * \if ENGLISH_LANG
	 * detect regions
	 * \else
	 * ����������
	 * \endif
	 */
    public SDK_POINT            DetectRegion[] = new SDK_POINT[FinalVar.SDK_MAX_DETECT_REGION_NUM];
    
    /**
	 * \if ENGLISH_LANG
	 * event file info
	 * \else
	 * �¼���Ӧ�ļ���Ϣ
	 * \endif
	 */
    public SDK_EVENT_FILE_INFO  stuFileInfo = new SDK_EVENT_FILE_INFO();
    
    /**
	 * \if ENGLISH_LANG
	 * Event action,0 means pulse event,1 means continuous event's begin,2means continuous event's end;
	 * \else
	 * �¼�������0��ʾ�����¼�,1��ʾ�������¼���ʼ,2��ʾ�������¼�����;
	 * \endif
	 */
    public byte                bEventAction;
    
    /**
	 * \if ENGLISH_LANG
	 * Serial number of the picture, in the same time (accurate to seconds) may have multiple images, starting from 0
	 * \else
	 * ͼƬ�����, ͬһʱ����(��ȷ����)�����ж���ͼƬ, ��0��ʼ
	 * \endif
	 */
    public byte                byImageIndex;
    
    /**
	 * \if ENGLISH_LANG
	 * flag(by bit),see NET_RESERVED_COMMON
	 * \else
	 * ץͼ��־(��λ)�������NET_RESERVED_COMMON 
	 * \endif
	 */
    public int               dwSnapFlagMask;
    
    public DEV_EVENT_INREGIONDETECTION_INFO() {
    	for (int i = 0; i < FinalVar.SDK_MAX_OBJECT_LIST; i++) {
    		stuObjectIDs[i] = new SDK_MSG_OBJECT();
    		stuTrackInfo[i] = new SDK_POLY_POINTS();
    	}
    	
    	for (int i = 0; i < FinalVar.SDK_MAX_DETECT_REGION_NUM; i++) {
    		DetectRegion[i] = new SDK_POINT();
    	}
    }
}
