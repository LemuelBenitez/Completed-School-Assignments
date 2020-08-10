//Cumalative total = AT + BT
//Turnaround time = BT + WT
//Wait Time = TAT - BT

#include<stdio.h>
#include<time.h>

#define arr 10
int bt[arr],at[arr],ct[arr],
    wt[arr],tat[arr],
    i,tat1=0,j=0,wt1=0,
    tempat,tempbt,idle=0;
float sum=0.0,sumt=0.0,avgwt,avgtt;

void sort(int t)
{ 
    clock_t begin = clock();
    for(i=1;i<=t;i++)
    {
        for(j=i+1;j<=t;j++)
        {
            if(at[i]>at[j])
            {
                tempat = at[i];
                at[i]=at[j];
                at[j]=tempat;
                tempbt = bt[i];
                bt[i]=bt[j];
                bt[j]=tempbt;
            }

        }
    }
    clock_t end = clock();
double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
}


int main()
{
   clock_t begin = clock();
    int n,i;
		char ch;
		FILE *file = fopen("/Users/lemuelbenitez/Documents/scheduler.txt","r");
		FILE *file1 =fopen("/Users/lemuelbenitez/Documents/arr_time.txt","r");
    FILE *file2=fopen("/Users/lemuelbenitez/Documents/burst_time.txt","r");

    printf("Number of processes : ");
    fscanf(file,"%d",&n);
		printf("%d\n",n);
    for(i=1;i<=n;i++)
    {
       printf("Arr_time[%d] : ", i);
       fscanf(file1,"%d",&at[i]);
			 printf("%d\n",at[i]);
    }
    for(i=1;i<=n;i++)
    {
       printf("Burst_time[%d] : ",i);
       fscanf(file2,"%d",&bt[i]);
			 printf("%d\n",bt[i]);
    }
    sort(n);
    ct[1]=at[1]+bt[1];
    for(i=2;i<=n;i++)
    {
        if(ct[i-1]<at[i])
        {
            idle=at[i]-ct[i-1];
            ct[i]=ct[i-1]+idle;
            ct[i]=ct[i]+bt[i];
        }
        else{
        ct[i]=ct[i-1]+bt[i];
        }
    }

    for(i=1;i<=n;i++)
    {
        tat[i]=ct[i]-at[i];
        sumt=sumt+tat[i];
    }
    for(i=1;i<=n;i++)
    {
        wt[i]=tat[i]-bt[i];
        sum=sum+wt[i];
    }
    printf("\n-----------------------------------------------\n");
    printf("Queue\t AT\t BT\t CT\t TAT\t WT\n");
    for (i=1;i<=n;i++)
    {
        printf("T%d\t %d\t %d\t %d\t %d\t %d\t\n",i,at[i],bt[i],ct[i],tat[i],wt[i]);
    }
    avgwt=sum/n;
    avgtt=sumt/n;
     printf("------------------------------------------------\n");
  
    printf("Average Waiting time : %.2f\n",avgwt);
    printf("Average Turnaround time : %.2f\n",avgtt);
    clock_t end = clock();
double time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    printf("Average Response Time: %f", time_spent); printf(" s");
    
}
