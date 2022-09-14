class Validate {
    public boolean validUtf8(int[] data) {
        boolean returned = true;
        for(int bit = 0; bit < data.length ; bit++)
        {
            if((data[bit]>=240 && data[bit]<=247)&&(bit+3<data.length))
            {
                if((data[bit+1]>= 128 && data[bit+1]<=191) && (data[bit+2]>= 128 && data[bit+2]<=191)&& (data[bit+3]>= 128 && data[bit+3]<=191))
                {
                    bit += 3;
                }
                else
                {
                    return false;
                }
            }
            else if((data[bit]>=224 && data[bit]<=239)&&(bit+2<data.length))
            {
                if((data[bit+1]>= 128 && data[bit+1]<=191) && (data[bit+2]>= 128 && data[bit+2]<=191))
                {
                    bit += 2;
                }
                else
                {
                    return false;
                }
            }
            else if((data[bit]>=192 && data[bit]<=223)&&(bit+1<data.length))
            {
                if(data[bit+1]>= 128 && data[bit+1]<=191)
                {
                    bit += 1;
                }
                else
                {
                    return false;
                }
            }
            else if(data[bit]>=0 && data[bit]<=127)
            {
                
            }
            else
            {
                return false;
            }
        }
        return returned;
    }
}